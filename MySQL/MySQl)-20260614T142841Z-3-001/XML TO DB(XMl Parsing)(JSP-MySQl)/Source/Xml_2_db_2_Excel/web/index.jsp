<%-- 
    Document   : index
    Created on : 8 Jan, 2014, 3:08:23 PM
    Author     : somnath
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
       <!-- <link rel="stylesheet" type="text/css" href="newStyle.css"/>-->
        <link rel="stylesheet" type="text/css" href="/Xml_2_db_2_Excel/css/front.css"/>    
            
       <script type="text/javascript">
            
            function validateform()
            
            {
                var tb1=document.Xml_Parsing.dvd_no.value;
                if(tb1==""||tb1=="NULL")
                    {
                        alert("Form Can not Submitted,Please Enter DVD No."); 
                        return false;
                        
                    }
                
                
            }
            
         
            
            
        </script>
        
        
    </head>
    <body>
        
        <form name="Xml_Parsing"  method="POST"  action="Xml_Parsing" onsubmit="return validateform()" >
        <table width="400" align="center" border="2" class="" >
            
            
            <tr>
                <td>
                    <h1>Please Enter Dvd No.:-</h1>
                    <%= request.getContextPath() %>
                </td>
            </tr>
            
             <tr>
                <td>
                    <input type="text" name="dvd_no">
                </td>
            </tr>
            
            <tr>
                
                <td> 
                    
                     <input type="Submit" value="Submit" name="Submit">

                     
                </td>
            </tr>
        </table>
        </form>
        
    </body>
</html>
