<html>
<head>
 <h1> Adding Details </h1>
</head>

<body>
<g:form method="post"  url="[action:'filterUser',controller:'filter']">
 <table>
   <thead> adding </thead>
   
   <tr>
   <td> gender</td>
   <td>
   <lable><g:radio name="gender" value="1"/> male </lable>
   <label><g:radio name="gender" value="2" checked="true"/> Female </label>
   </td> 
   </tr>
   <tr>
   <td> age </td>
   <td> <input type="text" value=" " name="age1" /></td>
   <td>And</td>
   <td> <input type="text" value=" " name="age2" /></td>
   </tr>
   <tr>
   <g:submitButton name="click" value="add" />
   
   </tr>
  
 </table>

</g:form>

</body>
</html>