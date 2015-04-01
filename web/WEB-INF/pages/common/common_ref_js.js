(function(){
    var oHead = document.getElementsByTagName('HEAD').item(0);

    var js_file_commonpath = 'pages/resource/',
        jsrefs = ['jquery.mobile-1.4.5.js','jquery.js'],
        cssrefs=['jquery.mobile.external-png-1.4.5.css','jquery.mobile.icons-1.4.5.css',
            'jquery.mobile.inline-png-1.4.5.css','jquery.mobile.inline-svg-1.4.5.css',
            'jquery.mobile.structure-1.4.5.css','jquery.mobile.theme-1.4.5.css'];


    for(var i=0;i<jsrefs.length;i++ ){
        var oScript= document.createElement("script");
        oScript.type = "text/javascript";
        oScript.src=js_file_commonpath+jsrefs[i];
        oHead.appendChild( oScript);
    }
    //<link href="Images/Type.css" rel="stylesheet" type="text/css" />
    for(var j=0;i<cssrefs.length;j++ ){
        var oLink= document.createElement("link");
        oLink.href = js_file_commonpath+cssrefs[j];
        oLink.type="text/css";
        oLink.rel="stylesheet"
        oHead.appendChild( oLink);
    }

    i=null,j=null;
})
