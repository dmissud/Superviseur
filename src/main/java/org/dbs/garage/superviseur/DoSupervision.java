package org.dbs.garage.superviseur;

import org.dbs.garage.usage.port.out.GarageDesc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Supervision")
public class DoSupervision extends GarageAbstractServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<GarageDesc> lstDescGarage;
        lstDescGarage = getServicefactory().getConsultGarageStock().retrieveSupervisionOfGarage();

        request.setAttribute("lstDescGarage", lstDescGarage);
        this.getServletContext().getRequestDispatcher("/WEB-INF/listDescOfGarage.jsp").forward(request, response);
    }
}
