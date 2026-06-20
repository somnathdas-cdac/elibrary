/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author somnath
 */
@WebServlet(name = "Xml_Parsing", urlPatterns = {"/Xml_Parsing"})
public class Xml_Parsing extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        
             out.println("<html>");
             out.println("<head>");
             out.println("<title>Servlet Xml_Parsing</title>");  
             out.print("<link href=/Xml_2_db_2_Excel/css/front1.css rel=stylesheet type=text/css>");
             out.println("</head>");
        
    try {
                
           //----------------DATABASE CONNECTION string----------------------------------------
          //----------------------------------------------------------------------------------------------------------------------------
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/struts_app","root", "");
           Statement stmt=con.createStatement();
       
       //-------------------------------------------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------------------------------------------
        
        
             
              int count=0,q=0,serial=1;
            
    if(request.getParameter("Submit")!= "null")   /*chech button is submitted or not*/
              
            {
              
                
                String directory_path;
                String dvd_no;
                dvd_no=request.getParameter("dvd_no").toString();
                directory_path="H://VB Audio Song at 23-12-2013//Vb_Song_Xml_upload";
             // directory_path=" H://VB Audio Song at 23-12-2013";
              
            
               
           out.print("<table  width='100%' align='center'class='header_dvd_no' >");  
           out.print("<tr>");
           out.print("<td>");
           out.print("List of XML under DVD_No<h1>"+dvd_no+"</h1>");
           out.print("</td>");
           out.print("</tr>");
           out.print("</table>");
                
                
           
               
             
                
              
                
                
        
                
           DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance(); 
           DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                      
               
              File parent_dir= new File(directory_path);  
              File[] file1 = parent_dir.listFiles();
             
           for (File  file : file1)
               
           {  
             
            
               
         if(file.isFile() && file.getName().endsWith(".xml"))
         {
               
    
 //-------------------**************XML PARSING START HERE*************------------------  
                   
                Document doc = dBuilder.parse(file);   
                   
              doc.getDocumentElement().normalize(); 
              
              
              String rootNode =  doc.getDocumentElement().getNodeName();
              NodeList bookslist = doc.getElementsByTagName(rootNode);
              
               XPath xPath =  XPathFactory.newInstance().newXPath();
               
              String  language,title,singer,lyricist,composer,songtype,copyright,subject,accessionno,recordno,recordslno,recordtype,recorddate,source,digitizeby,format,digitizedate;           
               
             language="Bengali";
             title="";
             singer="";
             songtype="";
             subject="";
             copyright="";
             accessionno="";
             recordno="";
             recordslno="";
             recordtype="";
             recorddate="";
             source="";
             digitizeby="";
             format="";
                   
     
       //--------------------------------------------language TAG PARSING--------------------------------------------------
            /*
                String expression_language = "/dublincore/language";
               NodeList nodeList_language = (NodeList) xPath.compile(expression_language).evaluate(doc, XPathConstants.NODESET);
               //out.print("language length:- ");
               //out.print(nodeList_language.getLength());
            //   out.print(nodeList_language.item(0).getFirstChild().getNodeValue());
              // String a= nodeList_language.item(0).getFirstChild().getNodeValue();
                  
                       // {
               if(nodeList_language.getLength()>0)
               {
                //out.print(nodeList_language.getLength());
               for (int i = 0; i < nodeList_language.getLength(); i++) {
             // out.println(nodeList_language.item(i).getFirstChild().getNodeValue());
              language= nodeList_language.item(i).getFirstChild().getNodeValue();
          
                 // out.print( language);
                //  out.print("<br/>");
               //}
            }
                 }
              
              */
      //--------------------------------- language TAG PARSING END--------------------------------------------------   
               String expression_title = "/dublincore/title";
               NodeList nodeList_title = (NodeList) xPath.compile(expression_title).evaluate(doc, XPathConstants.NODESET);
               if(nodeList_title.getLength()>0)
               {
                  // out.print(nodeList_title.getLength());
               for (int i =0; i < nodeList_title.getLength(); i++) {
             // out.println(nodeList_title.item(i).getFirstChild().getNodeValue());
            title=nodeList_title.item(i).getFirstChild().getNodeValue();
           // out.print( title);
             // out.print("<br/>");
            }
               }
               
       //---------------------------------------TITLE TAG PARSING END-------------------------------------------------
               
                String expression_singer = "/dublincore/singer";
               NodeList nodeList_singer = (NodeList) xPath.compile(expression_singer).evaluate(doc, XPathConstants.NODESET);
               
               for (int i = 0; i < nodeList_title.getLength(); i++) {
             // out.println(nodeList_title.item(i).getFirstChild().getNodeValue());
          singer=nodeList_singer.item(i).getFirstChild().getNodeValue();
           // out.print( singer);
              //out.print("<br/>");
            }
              
              /* 
             
                String expression_singer = "/dublincore/singer";
               NodeList nodeList_singer = (NodeList) xPath.compile(expression_singer).evaluate(doc, XPathConstants.NODESET);
               
               for (int i = 0; i < nodeList_singer.getLength(); i++) {
             // out.println(nodeList_singer.item(i).getFirstChild().getNodeValue());
            String  singer=nodeList_singer.item(i).getFirstChild().getNodeValue();
            
             out.print( singer);
              out.print("<br/>");
            }
             
                /*
               
       //------------------------------------- singer TAG ENDING----------------------------------------------------------    
               
                String expression_lyricist = "/dublincore/lyricist";
               NodeList nodeList_lyricist = (NodeList) xPath.compile(expression_lyricist).evaluate(doc, XPathConstants.NODESET);
               
               if(nodeList_lyricist.getLength()>0)
               {
               for (int i = 0; i < nodeList_lyricist.getLength(); i++) {
             // out.println(nodeList_title.item(i).getFirstChild().getNodeValue());
           String  lyricist=nodeList_lyricist.item(i).getFirstChild().getNodeValue();
            out.print( lyricist);
              out.print("<br/>");
               }
            }
               
               // out.println("*************************");
        //---------------------------lyricist TAG END--------------------------------------------------------------------------
           
               
              
                String expression_composer = "/dublincore/composer";
               NodeList nodeList_composer = (NodeList) xPath.compile(expression_composer).evaluate(doc, XPathConstants.NODESET);
               
               for (int i = 0; i < nodeList_composer.getLength(); i++) {
             // out.println(nodeList_singer.item(i).getFirstChild().getNodeValue());
             String composer=nodeList_composer.item(i).getFirstChild().getNodeValue();
                out.print( composer);
              out.print("<br/>");
            }
                */
               
     //---------------------composer TAG END-------------------------------------------------------------------------- 
               
               
             
                
                
        String expression_songtype = "/dublincore/songtype";
        NodeList nodeList_songtype = (NodeList) xPath.compile(expression_songtype).evaluate(doc, XPathConstants.NODESET);
               
               for (int i = 0; i < nodeList_songtype.getLength(); i++) {
             // out.println(nodeList_singer.item(i).getFirstChild().getNodeValue());
            songtype=nodeList_songtype.item(i).getFirstChild().getNodeValue();
             //out.print(songtype);
              //out.print("<br/>");
              
            }
               
     //-----------------------songtype TAG END---------------------------------------------------------------------
                /*
                
                  String expression_subject = "/dublincore/subject";
               NodeList nodeList_subject = (NodeList) xPath.compile(expression_subject).evaluate(doc, XPathConstants.NODESET);
                if(nodeList_subject.getLength()>0)
               for (int i = 0; i < nodeList_subject.getLength(); i++) {
             // out.println(nodeList_singer.item(i).getFirstChild().getNodeValue());
            subject=nodeList_subject.item(i).getFirstChild().getNodeValue();
            out.print(subject);
            
              out.print("<br/>");
              
            }
              
                */
               
      //-----------------------subject TAG END---------------------------------------------------------------------  
             /*
                     
           
              String expression_copyright = "/dublincore/copyright";
               NodeList nodeList_copyright = (NodeList) xPath.compile(expression_copyright).evaluate(doc, XPathConstants.NODESET);
               
               for (int i = 0; i < nodeList_copyright.getLength(); i++) {
             // out.println(nodeList_singer.item(i).getFirstChild().getNodeValue());
            copyright=nodeList_copyright.item(i).getFirstChild().getNodeValue();
             out.print(copyright);
              out.print("<br/>");
              
            }
              */
      //-----------------------copyright TAG END---------------------------------------------------------------------     
              
              String expression_accessionno = "/dublincore/accessionno";
               NodeList nodeList_accessionno = (NodeList) xPath.compile(expression_accessionno).evaluate(doc, XPathConstants.NODESET);
               
               for (int i = 0; i < nodeList_accessionno.getLength(); i++) {
             // out.println(nodeList_singer.item(i).getFirstChild().getNodeValue());
              accessionno=nodeList_accessionno.item(i).getFirstChild().getNodeValue();
           
              //out.print(accessionno);
             // out.print("<br/>");
              
            }
               
      //-----------------------copyright TAG END---------------------------------------------------------------------  
               
           String expression_recordno = "/dublincore/recordno";
               NodeList nodeList_recordno = (NodeList) xPath.compile(expression_recordno).evaluate(doc, XPathConstants.NODESET);
               
               for (int i = 0; i < nodeList_recordno.getLength(); i++) {
             // out.println(nodeList_singer.item(i).getFirstChild().getNodeValue());
          recordno=nodeList_recordno.item(i).getFirstChild().getNodeValue();
               
              //  out.print(recordno);
              //out.print("<br/>");
               
            }
               
      //-----------------------recordno TAG END---------------------------------------------------------------------       
               
             String expression_recordslno = "/dublincore/recordslno";
               NodeList nodeList_recordslno = (NodeList) xPath.compile(expression_recordslno).evaluate(doc, XPathConstants.NODESET);
               
               for (int i = 0; i < nodeList_recordslno.getLength(); i++) {
             // out.println(nodeList_singer.item(i).getFirstChild().getNodeValue());
            recordslno=nodeList_recordslno.item(i).getFirstChild().getNodeValue();
          
             //  out.print(recordslno);
             // out.print("<br/>");
              
            }
               
      //-----------------------recordslno TAG END---------------------------------------------------------------------  
               
                  String expression_recordtype = "/dublincore/recordtype";
               NodeList nodeList_recordtype = (NodeList) xPath.compile(expression_recordtype).evaluate(doc, XPathConstants.NODESET);
               
               for (int i = 0; i < nodeList_recordtype.getLength(); i++) {
             // out.println(nodeList_singer.item(i).getFirstChild().getNodeValue());
            recordtype=nodeList_recordtype.item(i).getFirstChild().getNodeValue();
          
             // out.print(recordtype);
             // out.print("<br/>");
              
            }
               
      //-----------------------recordtype TAG END--------------------------------------------------------------------- 
            
               
                  String expression_recorddate = "/dublincore/recorddate";
               NodeList nodeList_recorddate = (NodeList) xPath.compile(expression_recorddate).evaluate(doc, XPathConstants.NODESET);
               
               for (int i = 0; i < nodeList_recordtype.getLength(); i++) {
             // out.println(nodeList_singer.item(i).getFirstChild().getNodeValue());
           recorddate=nodeList_recorddate.item(i).getFirstChild().getNodeValue();
             // out.print(recorddate);
            //  out.print("<br/>");
              
            }
               
      //-----------------------recorddate TAG END--------------------------------------------------------------------- 
               
               
                  String expression_source = "/dublincore/source";
               NodeList nodeList_source = (NodeList) xPath.compile(expression_source).evaluate(doc, XPathConstants.NODESET);
               
               for (int i = 0; i < nodeList_source.getLength(); i++) {
             // out.println(nodeList_singer.item(i).getFirstChild().getNodeValue());
           source=nodeList_source.item(i).getFirstChild().getNodeValue();
         
            //   out.print(source);
             // out.print("<br/>");
              
            }
               
           
      //-----------------------recorddate TAG END--------------------------------------------------------------------- 
               
                  String expression_digitizeby = "/dublincore/digitizeby";
               NodeList nodeList_digitizeby = (NodeList) xPath.compile(expression_digitizeby).evaluate(doc, XPathConstants.NODESET);
               
               for (int i = 0; i < nodeList_digitizeby.getLength(); i++) {
             // out.println(nodeList_singer.item(i).getFirstChild().getNodeValue());
           digitizeby=nodeList_digitizeby.item(i).getFirstChild().getNodeValue();
          
           //  out.print(digitizeby);
            //  out.print("<br/>");
              
            }
               
      //-----------------------digitizeby TAG END--------------------------------------------------------------------- 
               String v1;
                  String expression_format = "/dublincore/format";
               NodeList nodeList_format = (NodeList) xPath.compile(expression_format).evaluate(doc, XPathConstants.NODESET);
               
               for (int i = 0; i < nodeList_format.getLength(); i++) {
             // out.println(nodeList_singer.item(i).getFirstChild().getNodeValue());
           format=nodeList_format.item(i).getFirstChild().getNodeValue();
             // out.print("<br/>");
              v1=format;
            //   out.print(v1);
            //  out.print("<br/>");
              
            }
               // out.print("<br/>");
              // out.print(v1);
      //-----------------------format TAG END--------------------------------------------------------------------- 
               
                  String expression_digitizedate = "/dublincore/digitizedate";
               NodeList nodeList_digitizedate = (NodeList) xPath.compile(expression_digitizedate).evaluate(doc, XPathConstants.NODESET);
               
               for (int i = 0; i < nodeList_digitizedate.getLength(); i++) {
             // out.println(nodeList_singer.item(i).getFirstChild().getNodeValue());
            digitizedate=nodeList_digitizedate.item(i).getFirstChild().getNodeValue();
              //  out.print(digitizedate);
             // out.print("<br/>");
             // out.print("******************************");
            }
             
      //-----------------------recorddate TAG END--------------------------------------------------------------------- 
               
       //----------------------Query for insert to DATABASE  START HERE-----------------------------------------------
               
               
          String Query,query_pre;
          int result;
        // Query="INSERT INTO xml_2_xls_tb(language,title,singer,songtype,copyright,accessionno,recordno,recordslno,recordtype,recorddate,source,digitizeby,format,digitizedate) VALUES('"+language+"','"+title+"','"+singer+"''"+songtype+"','"+copyright+"','"+accessionno+"','"+recordno+"','"+recordtype+"','"+recorddate+"','"+source+"','"+digitizeby+"')"; 
         query_pre="INSERT INTO  xml_2_xls_tb(serial_no,language,title,singer,songtype,subject,copyright,accessionno,recordno,recordslno,recordtype,recorddate,source,digitizeby,format,dvd_no)VALUES('"+serial+"','"+language+"','"+title+"','"+singer+"','"+songtype+"','"+subject+"','"+copyright+"','"+accessionno+"','"+recordno+"','"+recordslno+"','"+recordtype+"','"+recorddate+"','"+source+"','"+digitizeby+"','"+format+"','"+dvd_no+"')";     
        
         
         // stmt.executeUpdate("INSERT INTO xml_2_xls_tb(language,title,singer,songtype)VALUES('ABC','ABC','ABC','ABC')");
                           
            //stmt.executeUpdate("INSERT INTO matadata_fillup VALUES('abc','dcm')"); 
           // stmt.executeUpdate("INSERT INTO 'xml_2_xls_tb' VALUES('abc','dcm')"); 
         /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<oooooooooo>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
         
         
         result = stmt.executeUpdate(query_pre);
         
         
         
    //----------------------Query for insert to DATABASE  START HERE-----------------------------------------------
         
         
          //out.print(result);
          
          /*------------------------CHECK FOR HOW MUCH TIME DATA INSERT INTO DATABASE----------------*/
         if(result!=0)
           {
               q++;
           }
           
       //String language= (String) ((Element) bookslist.item(0)).getElementsByTagName("language").item(0).getChildNodes().item(0).getNodeValue();
          /*         
       //File fXmlFile1 = new File("H:/VB Audio Song at 23-12-2013/Side-1/Akash Hotey Khoslo Tara.xml");
         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	Document doc = dBuilder.parse(file);
	//Document doc = dBuilder.parse(fXmlFile1);
        doc.getDocumentElement().normalize();
        
        //------------------------------------------------------------------------
        
        
        String rootNode =  doc.getDocumentElement().getNodeName();
        NodeList bookslist = doc.getElementsByTagName(rootNode); 
      //-------------------------------------------------------------------------------
        
        String language= (String) ((Element) bookslist.item(0)).getElementsByTagName("language").item(0).getChildNodes().item(0).getNodeValue();
         String title= (String) ((Element) bookslist.item(0)).getElementsByTagName("title").item(0).getChildNodes().item(0).getNodeValue();
        //String language= doc.getElementsByTagName("language").toString();
          *
          */
        
     //-------------------------------------------------------------------------------------------------------------------------//
         
          
            
           // out.println("<html>");
           // out.println("<head>");
           // out.println("<title>Servlet Xml_Parsing</title>");  
           // out.print("<link rel='stylesheet' type='type/css' href='/Xml_2_db_2_Excel/css/front.css'");
           // out.println("</head>");
           // out.println("<body>");
         
            out.print("<table width='600' align='center' border='1' class='servlet_dspl'>");
            out.print("<tr>");
            //out.print("<td>");
            out.print("<td>"+serial+"</td><td>"+language+"</td><td>"+title+"</td><td>"+singer+"</td><td>"+songtype+"</td><td>"+recordno+"</td><td>"+source+"</td><td>"+digitizeby+"</td><td>"+format+"</td>");
           // out.print("</td>");
            out.print("</tr>");
            out.print("</table>");
          
          
          count++;
          serial++;
                            
                               }  /*.............file extension checking end brasses..............*/
            
               //}
            
            
                          }    /*.............for loop  end brasses..............*/
           
           
           
                 }   /*...........submit button end bracess..............*/
          
         // out.print(count);
          if(count == q)
          {
              
            out.print("<table width='600' align='center' border='1' class='servlet_db_result'");
            out.print("<tr>");
            out.print("<td>");
            out.print("Programme Run Fine.................");
            out.print("<br/>");
            out.print("Total........"+count+".............No. of XML uploaded");
            out.print("</td>");
            out.print("</tr>");
            out.print("</table>");
         // out.print(count);
         // out.print("all the xml upload ed");
          }
          
           
           
            out.println("</body>");
            out.println("</html>");
          
          
          
          
          
            
        /*............... try block end here...................................*/
            }catch (Exception e) 
            {
            e.printStackTrace();
             } finally 
                
            {            
            out.close();
             }
            
            
            
            
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
