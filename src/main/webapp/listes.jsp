<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Liste Joueurs</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="styles.css">
    </head>
    <body>
        <div class="row">
            <div class="column">
                    <!-- faire de la jstl -->
                    Liste Femmes : <br/>
                    <table>
                        <c:forEach var = "joueur" items="${listeFemmes}">
                        		<TR>
                                	<TD>${joueur.prenom}</TD><TD>${joueur.nom}</TD>
                        		</TR>
                        </c:forEach>
                    </table>
            </div>
            <div class="column">
                Liste Hommes : <br/>
                <table>
                    <c:forEach var = "joueur" items="${listeHommes}">
                    		<TR>
                            	<TD>${joueur.prenom}</TD><TD>${joueur.nom}</TD>
                    		</TR>
                    </c:forEach>
                </table>
            </div>
        </div>
    </body>
</html>
