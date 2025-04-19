<%@ page language="java" %>
<%@ page import="form.beans.*" %>
<%@ page import="java.util.*" %>
<%@ page import="mod.sco.*" %>

<%
    NoteForm nf;
    if (session.getAttribute("nf") == null) {
        nf = new NoteForm();
    } else {
        nf = (NoteForm) session.getAttribute("nf");
    }

    Iterator<Note> it = nf.getLesNotes().iterator();
    float somme = 0;
    int compteur = 0;
%>

<html>
<head>
    <title>Gestion des notes</title>
</head>
<body bgcolor="#FFFFFF">
    <h2>Notes de l'étudiant</h2>
    <form method='post' action='ControleurServlet'>
        Num Inscription : <input type='text' name='numIns'>
        <input type='submit' value='OK' name='action'>
    </form>

    <br>

    <table border='1' width='80%'>
        <tr>
            <th>Matière</th>
            <th>Note</th>
        </tr>
        <%
            while (it.hasNext()) {
                Note n = it.next();
                somme += n.getNote();
                compteur++;
        %>
        <tr>
            <td><%= n.getMatiere() %></td>
            <td><%= n.getNote() %></td>
        </tr>
        <% } %>

        <% if (compteur > 0) { %>
        <tr>
            <td><strong>Moyenne</strong></td>
            <td><strong><%= somme / compteur %></strong></td>
        </tr>
        <% } %>
    </table>
</body>
</html>
