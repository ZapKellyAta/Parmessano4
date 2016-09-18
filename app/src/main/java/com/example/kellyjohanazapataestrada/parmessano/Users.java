package com.example.kellyjohanazapataestrada.parmessano;

import java.util.ArrayList;

public class Users extends LogginActivity
{
    public static String Usuario, Pass, Email;
    static ArrayList<Users> arrayObjetos2= new ArrayList <Users> ();

    public static String getUsuario() {
        return Usuario;
    }

    public static void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public static String getPass() {
        return Pass;
    }

    public static void setPass(String pass) {
        Pass = pass;
    }

    public static String getEmail() {
        return Email;
    }

    public static void setEmail(String email) {
        Email = email;
    }

    public void BuscarFirst()
    {
        if(arrayObjetos2.size()==0)
            bandera = 0;
        else
            bandera=1;
    }
}
