function getElementsByClassName(n) {
    var classElements = [],allElements = document.getElementsByTagName('*');
    for (var i=0; i< allElements.length; i++ )
    {
        if (allElements[i].className == n ) {
            classElements[classElements.length] = allElements[i];
        }
    }
    return classElements;
}
var but=getElementsByClassName('ncss-brand pt2-sm pr5-sm pb2-sm pl5-sm u-uppercase ncss-btn-black fs18-sm fs16-lg ncss-brand ncss-btn-black pb3-sm prl5-sm pt3-sm u-uppercase css-1hzp36c addToCartBtn');
but[0].click();





