package com.emergency.rescue.service;

import com.emergency.rescue.util.Constants;
import com.emergency.rescue.util.DateUtils;
import com.emergency.rescue.vo.ECGVo;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ECGService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public synchronized List<ECGVo> getECGVo(){
        StringBuffer buffer=new StringBuffer();
        //DATE_FORMAT(create_date,'%Y-%m-%d %H:%i:%s') as s_date,
        buffer.append("select create_date,data_content from t_collection_data where type=1 ");
        if(!StringUtils.isEmpty(Constants.endTime)){
            buffer.append(" and create_date> '").append(Constants.endTime).append("'");
        }
        buffer.append(" order by create_date limit 0,5");
        List<ECGVo> list= (List<ECGVo>) jdbcTemplate.query(buffer.toString(), new RowMapper<ECGVo>() {
            @Override
            public ECGVo mapRow(ResultSet rs, int i) throws SQLException {
                ECGVo vo=new ECGVo();
                Timestamp time = rs.getTimestamp("create_date");
                vo.setTime(time.getTime());
                String date=rs.getString("data_content");
                JSONObject object=JSONObject.fromObject(date);
                vo.setValue( object.getString("II"));
                return vo;
            }
        });
        if(list!=null && list.size()>0){
            ECGVo ecgVo = list.get(list.size() - 1);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            Date date = new Date(ecgVo.getTime());
            Constants.endTime= sdf.format(date);
        }
        return list;
    }

}
