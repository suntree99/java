package com.darmawan.budi.exercise.servlet.example;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
@WebServlet(name="servlet-handle-request", urlPatterns = {"/kirim"})
public class ServletHandleRequest extends HttpServlet {

    String html = "<!doctype html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "    <meta name=\"viewport\"\n" +
            "          content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n" +
            "    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n" +
            "    <title>Document</title>\n" +
            "</head>\n" +
            "<body>\n" +
            "<table>\n" +
            "    <thead>\n" +
            "    <tr>\n" +
            "    " +
            "    <td>NIM</td>\n" +
            "        <td>Nama" +
            "</td>\n" +
            "        <td>Kota</td>\n" +
            "       " +
            " <td>Tanggal</td>\n" +
            "  " +
            "      <td></td>\n" +
            "    </tr>\n" +
            "    <" +
            "/thead>\n" +
            "    <tbody>\n" +
            "    <tr>\n" +
            "    " +
            "    <td>%s</td>\n" +
            "        <td>%s</" +
            "td>\n" +
            "        <td>" +
            "%s</td>\n" +
            "       " +
            " <td>%s</td>\n" +
            "  " +
            "      <td></td>\n" +
            "    </tr>\n" +
            "    ";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nim = req.getParameter("nim");
        String nama = req.getParameter("nama");
        String kota = req.getParameter("kota");
        String tanggal = req.getParameter("tanggal");

        log.info("data http GET: {nim : {}, nama: {}, kota : {}, tanggal : {}}", nim, nama, kota, tanggal);


        resp.getWriter().print(String.format(html, nim, nama, kota, tanggal));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nim = req.getParameter("nim");
        String nama = req.getParameter("nama");
        String kota = req.getParameter("kota");
        String tanggal = req.getParameter("tanggal");

        log.info("data http POST: {nim : {}, nama: {}, kota : {}, tanggal : {}}", nim, nama, kota, tanggal);


        resp.getWriter().print(String.format(html, nim, nama, kota, tanggal));
    }
}
