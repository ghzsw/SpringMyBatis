(function(document){
    var oHead = document.getElementsByTagName('HEAD').item(0);

    var jsFileCommonpath = 'pages/',
        customeJsFile = jsFileCommonpath+'common/',
        jqueryFileCommonpath=jsFileCommonpath+'/resource/',
        jqueryJsRefs = ['jquery.js','jquery.mobile-1.4.5.js'],
        jqueryCssRefs=['jquery.mobile.external-png-1.4.5.css','jquery.mobile.icons-1.4.5.css',
            'jquery.mobile.inline-png-1.4.5.css','jquery.mobile.inline-svg-1.4.5.css',
            'jquery.mobile.structure-1.4.5.css','jquery.mobile.theme-1.4.5.css'],
        customJsRefs=['FavotrityFood.js','URLS.js'],
        resources = [new JsResourceFile(customeJsFile,customJsRefs),
                     new JsResourceFile(jqueryFileCommonpath,jqueryJsRefs),
                     new CssResourceFile(jqueryFileCommonpath,jqueryCssRefs)];

    function ResourceFile (basepath,filenames){
        this.basepath = basepath;
        this.filenames = filenames;
    }

    function JsResourceFile(basepath,filenames){
        ResourceFile.call(this,basepath,filenames);
        this.joinHeaderFile = function(){
            for(var i=0;i<filenames.length;i++ ){
                var oScript= document.createElement("script");
                oScript.type = "text/javascript";
                oScript.src=basepath+filenames[i];
                oHead.appendChild( oScript);
            }
        }
    }

    function CssResourceFile(basepath,filenames){
        ResourceFile.call(this,basepath,filenames);
        this.joinHeaderFile = function(){
            //<link href="Images/Type.css" rel="stylesheet" type="text/css" />
            for(var j=0;j<filenames.length;j++ ){
                var oLink= document.createElement("link");
                oLink.href = basepath+filenames[j];
                oLink.type="text/css";
                oLink.rel="stylesheet"
                oHead.appendChild( oLink);
            }
        }
    }

    //引入头部文件
    for(var key = 0 ;key< resources.length;key++){
        resources[key].joinHeaderFile();
    }
})(document)
