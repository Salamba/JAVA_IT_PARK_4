<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link href="/css/style.css" rel="stylesheet" type="text/css">
    <title>Модели украшений</title>
</head>
<body>
<#include "topMeny.ftl">
<br>
<br>
<div>
    <#list model.jewerlyModelsDtoList as jewerlyModel>
         <li id="idlistjewerlymodels" ><img class="img-circle" width='100' height='100' src="${jewerlyModel.imageUrl}">
        ${jewerlyModel.model}</li><br>
    </#list>
</div>
</body>
</html>