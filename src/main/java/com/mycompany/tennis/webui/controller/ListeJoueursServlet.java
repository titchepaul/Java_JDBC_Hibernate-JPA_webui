package com.mycompany.tennis.webui.controller;

import com.mycompany.tennis.core.dto.JoueurDto;
import com.mycompany.tennis.core.service.JoueurService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/listes")
public class ListeJoueursServlet extends HttpServlet {

    private JoueurService joueurService = null;

    public ListeJoueursServlet(){
        this.joueurService = new JoueurService();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<JoueurDto> listeHommes = joueurService.getListJoueurs('H');
        req.setAttribute("listeHommes",listeHommes);
        List<JoueurDto> listeFemmes = joueurService.getListJoueurs('F');
        //req.setAttribute("listeHommes",listeHommes);
        req.setAttribute("listeFemmes",listeFemmes);

        System.out.println("Taille Femmes: "+listeFemmes.size());
        System.out.println("Taille Hommes : "+listeHommes.size());
        RequestDispatcher disp = req.getRequestDispatcher("listes.jsp");
        disp.forward(req,resp);

    }
}
