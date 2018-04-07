package com.emergency.rescue.service;

import com.emergency.rescue.util.Constants;
import com.emergency.rescue.vo.ECGVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class ECGService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public synchronized List<ECGVo> getECGVo(){
        StringBuffer buffer=new StringBuffer();
        buffer.append("select create_date,data_content from t_collection_data where type=1 ");
        if(!StringUtils.isEmpty(Constants.endTime)){
            buffer.append(" and create_date> '").append(Constants.endTime).append("'");
        }
        buffer.append(" order by create_date");
        List<ECGVo> list= (List<ECGVo>) jdbcTemplate.query(buffer.toString(), new RowMapper<ECGVo>() {
            @Override
            public ECGVo mapRow(ResultSet rs, int i) throws SQLException {
                ECGVo vo=new ECGVo();
                vo.setTime(rs.getString("create_date"));
                vo.setValue(rs.getString("data_content"));
                return vo;
            }
        });
        if(list!=null && list.size()>0){
            ECGVo ecgVo = list.get(list.size() - 1);
            Constants.endTime=ecgVo.getTime();
        }
        return list;
    }

}
