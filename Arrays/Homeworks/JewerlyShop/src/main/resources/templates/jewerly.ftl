<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <link href="/css/style.css" rel="stylesheet" type="text/css">
    <title>Изделия</title>
</head>
<body>
<#include "topMeny.ftl">
<br>
    <br>
    <div>
    <#list model.carList as jewerly>
        <li id="idlistjewerly"><a href="/jewerlymodel?id=${jewerly.id}">${jewerly.brand}</li>
    </#list>
</div>
</body>
</html>