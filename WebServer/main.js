var map = new ol.Map({
    target: 'map',
    layers:[
        new ol.layer.Tile({
            source: new ol.source.OSM()
        })
    ],
    view : new ol.View({
        center: ol.proj.fromLonLat([127.3920, 36.3380]),
        zoom: 17
    })
});