package com.darmawan.budi.exercise.mahaiswa;

import com.darmawan.budi.exercise.model.Mahasiswa;
import com.darmawan.budi.exercise.service.MahasiswaService;
import com.darmawan.budi.exercise.service.impl.MahasiswaDummyImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "mahasiswa-list-controller", urlPatterns = {"/mahasiswa/list"})
public class MahasiswaController extends HttpServlet {

    private MahasiswaService service;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        service = new MahasiswaDummyImpl();
        List<Mahasiswa> list = service.findAll();
        req.setAttribute("lists", list);
//        send attribute to jsp
        req.getRequestDispatcher("/WEB-INF/mahasiswa/list-mahasiswa.jsp").forward(req, resp);
    }
}