<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/formulario1.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My form</title>
    </head>
    <body>
        <div id="formulario">
        <h1 id="tituloform">Registrar profesor</h1>
        <form method="post" action="add-profesor">
            <div class="itemform">
            Nombre
            <input type="text" name="nombre-prof" class="cuadroTexto" placeholder="Introduzca el nombre"/><br/>
            </div>
            <div class="itemform">
            Telefono
            <input type="text" name="telefono" class="cuadroTexto" placeholder="Introduzca el número de telefono"/><br/>
            </div>
            <div class="itemform">
            Edad
            <input type="text" name="edad" class="cuadroTexto" placeholder="Introduzca la edad"/><br/>
            </div>
            <div class="itemform">
            DNI
            <input type="text" name="dni" class="cuadroTexto" placeholder="Introduzca el DNI"/><br/>
            </div>
            
            <input type="submit" value="Registrar" id="botonRegistrar"/>
        </form>
        </div>
        
        <%
            String profesor = request.getParameter("profesor");
            if (profesor == null)
                profesor = "";
                
            if (profesor.equals("ok")) {
                out.println("<p style='color:green'>El profesor se ha registrado con éxito</p>");
            } else if (profesor.equals("error")) {
                out.println("<p style='color:red'>No se ha podido registrar el profesor</p>");
            }
        %>
        <%
            String telefono = request.getParameter("telefono");
            if (telefono == null)
                telefono = "";
                
            if (telefono.equals("ok")) {
                out.println("<p style='color:green'>El telefono se ha registrado con éxito</p>");
            } else if (telefono.equals("error")) {
                out.println("<p style='color:red'>No se ha podido registrar el telefono</p>");
            }
        %>
         <%
            String edadGET = request.getParameter("edad");
        if(edadGET!=null) {
            int edad=0;
            double factorial=1;
            boolean error = false;
            try {
                edad = Integer.valueOf(edadGET);
                if(edad<1) {
                    error = true;
                } else {
                    for(int i=edad; i>1; i--) {
                        factorial *= i;            
                    }
                }
            } catch(NumberFormatException e) {
                error = true;
            }
            if(error) {
                out.println("<p>Debe indicar un número entero mayor que 0</p>");
            } else {
                // Mostrar el resultado en la página usando el objeto out
                out.println("<p>Resultado: "+ edad + "! = " + factorial+"</p>");
            }
        }
        %>
         <%
            String dni = request.getParameter("edad");
            if (dni == null)
                dni = "";
                
            if (dni.equals("ok")) {
                out.println("<p style='color:green'>El dni se ha registrado con éxito</p>");
            } else if (dni.equals("error")) {
                out.println("<p style='color:red'>No se ha podido registrar el dni</p>");
            }
        %>
         <%
            String status = request.getParameter("status");
            if (status == null)
                status = "";
                
            if (status.equals("ok")) {
                out.println("<p style='color:green'>El profesor se ha registrado con éxito</p>");
            } else if (profesor.equals("error")) {
                out.println("<p style='color:red'>No se ha podido registrar el profesor</p>");
            }
        %>
    </body>
</html>
