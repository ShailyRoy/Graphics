import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;
import javax.swing.JFrame;
import java.io.*;
import java.util.*;

public class Line implements GLEventListener{

    static GLProfile profile = GLProfile.get(GLProfile.GL2);
    static GLCapabilities capabilities = new GLCapabilities(profile);
    // The canvas
    static GLCanvas glcanvas = new GLCanvas(capabilities);
    double x0 = -0.25;
    double x1 = 0.25;
    double y0 = 0;
    double y1 = .05;
   
   
    double a=0.25+.05;
    double b=.25+.5;
    double c=0;
    double d=0.5;
   
    public static void main(String[] args) {
        //getting the capabilities object of GL2 profile


        Line l = new Line();
        //creating frame
        glcanvas.addGLEventListener(l);
        glcanvas.setSize(600, 400);

        final JFrame frame = new JFrame ("straight Line");
        //adding canvas to frame
        frame.getContentPane().add(glcanvas);
        frame.setSize(frame.getContentPane().getPreferredSize());
        frame.setVisible(true);

    }
    public void display(GLAutoDrawable drawable) {
        final GL2 gl = drawable.getGL().getGL2();
        gl.glBegin (GL2.GL_POINTS);//static field
   
        try {
            Scanner sc=new Scanner (new FileReader("input.txt"));
         String s=sc.next();
       
         if(s.equals("1")){
             a4(gl);
             a5(gl);
         }
         else  if(s.equals("2")){
             a3(gl);
             a8(gl);
             a9(gl);
             a10(gl);
             a1(gl);
             a7(gl);
             a12(gl);
         }
         
         else  if(s.equals("3")){
             a3(gl);
             a8(gl);
             a9(gl);
             a10(gl);
             a1(gl);
             a11(gl);
             a12(gl);
             a7(gl);
         }
         else  if(s.equals("4")){
             a2(gl);
             a1(gl);
             a10(gl);
             a9(gl);
             a11(gl);
         }
         else  if(s.equals("5")){
             a2(gl);
             a3(gl);
             a8(gl);
             a1(gl);
             a10(gl);
             a11(gl);
             a12(gl);
             a7(gl);
         }
         else  if(s.equals("6")){
             a8(gl);
             a3(gl);
             a2(gl);
             a6(gl);
             a7(gl);
             a12(gl);
             a11(gl);
             a10(gl);
             a1(gl);
         }
         else  if(s.equals("7")){
             a3(gl);
             a8(gl);
             a14(gl);
             a16(gl);
         }
         else  if(s.equals("8")){
             a2(gl);
             a3(gl);
             a8(gl);
             a9(gl);
             a11(gl);
             a12(gl);
             a6(gl);
             a7(gl);
             a1(gl);
             a10(gl);
             
         }
         else  if(s.equals("9")){
             a2(gl);
             a3(gl);
             a8(gl);
             a9(gl);
             a11(gl);
             a12(gl);
             a7(gl);
             a1(gl);
             a10(gl);
             
         }
         else  if(s.equals("0")){
             a2(gl);
             a3(gl);
             a8(gl);
             a9(gl);
             a11(gl);
             a12(gl);
             a6(gl);
             a7(gl);
             
         }
         
         else{
           
           
         if(s.equals("A")||s.equals("B")||s.equals("E")||s.equals("F")||s.equals("H")||s.equals("P")||s.equals("K")||s.equals("R")||s.equals("S")){
        //1
             a1(gl);
         }
         
         if(s.equals("A")||s.equals("B")||s.equals("E")||s.equals("F")||s.equals("G")||s.equals("H")||s.equals("P")||s.equals("R")||s.equals("S")){
               
        //10
             a10(gl);
         }

       
         
         if(s.equals("K")||s.equals("N")||s.equals("Q")||s.equals("R")||s.equals("W")||s.equals("X")){
                a13(gl);
        //13
         }
       
       
         if(s.equals("M")||s.equals("N")||s.equals("X")||s.equals("Y")){
                a15(gl);
        //15
         }
         
         if(s.equals("K")||s.equals("M")||s.equals("V")||s.equals("X")||s.equals("Y")||s.equals("Z")){
                a14(gl);
        //14
         }
       
         if(s.equals("V")||s.equals("W")||s.equals("Z")||s.equals("X")){
                a16(gl);
        //16
         }
       
         if(s.equals("A")||s.equals("C")||s.equals("W")||s.equals("V")||s.equals("B")||s.equals("D")||s.equals("E")||s.equals("F")||s.equals("H")||s.equals("K")||s.equals("L")||s.equals("M")||s.equals("N")||s.equals("O")||s.equals("P")||s.equals("Q")||s.equals("R")||s.equals("S")||s.equals("U")){
        //2
    a2(gl);
        }
         if(s.equals("A")||s.equals("B")||s.equals("D")||s.equals("H")||s.equals("J")||s.equals("M")||s.equals("N")||s.equals("O")||s.equals("P")||s.equals("Q")||s.equals("R")||s.equals("U")||s.equals("W")){
               
        //9
             a9(gl);
   
         }
         
        if(s.equals("A")||s.equals("B")||s.equals("C")||s.equals("D")||s.equals("E")||s.equals("F")||s.equals("G")||s.equals("O")||s.equals("P")||s.equals("Q")||s.equals("R")||s.equals("S")||s.equals("T")||s.equals("Z")){
            a3(gl);
        //3
        }
       
        if(s.equals("A")||s.equals("B")||s.equals("C")||s.equals("D")||s.equals("E")||s.equals("F")||s.equals("G")||s.equals("O")||s.equals("P")||s.equals("Q")||s.equals("R")||s.equals("S")||s.equals("T")||s.equals("Z")){
              
        //8
        a8(gl);   
        }
       
       
        if(s.equals("D")||s.equals("I")||s.equals("T")){
        a4(gl);
        //4
        }
       
        if(s.equals("D")||s.equals("I")||s.equals("T")||s.equals("Y")){
        //5
    a5(gl);
        }
       
       
        if(s.equals("A")||s.equals("B")||s.equals("C")||s.equals("E")||s.equals("F")||s.equals("G")||s.equals("H")||s.equals("K")||s.equals("L")||s.equals("M")||s.equals("N")||s.equals("O")||s.equals("P")||s.equals("Q")||s.equals("R")||s.equals("U")||s.equals("V")||s.equals("W")){   
            //6
        a6(gl);
        }
       
         if(s.equals("B")||s.equals("C")||s.equals("D")||s.equals("E")||s.equals("G")||s.equals("J")||s.equals("L")||s.equals("O")||s.equals("Q")||s.equals("S")||s.equals("U")||s.equals("Z")){
            a7(gl);   
        //7
         }
         
         if(s.equals("B")||s.equals("C")||s.equals("D")||s.equals("E")||s.equals("G")||s.equals("J")||s.equals("L")||s.equals("O")||s.equals("Q")||s.equals("S")||s.equals("U")||s.equals("Z")){
                a12(gl);
        //12
         }
         if(s.equals("A")||s.equals("B")||s.equals("D")||s.equals("H")||s.equals("J")||s.equals("M")||s.equals("N")||s.equals("O")||s.equals("Q")||s.equals("S")||s.equals("U")||s.equals("W")){
            a11(gl);   
        //11
         }}
        }
         catch (Exception e){}
       

        gl.glEnd();
    }

       
    public void a1(GL2 gl){ x0 = -0.25;
     x1 = 0.25;
     y0 = 0;
        y1 = .05;
        for(double i=1;i<=10;i++)
        {
            DDA(x0,y0,x1,y1,gl);
            y0+=0.01;
            y1+=0.01;
        }
        }
   
   
    public void a2(GL2 gl){    y0 = 0.09;
    y1 = 0.6;
    x0 = -0.3;
    x1 = -0.25;
    for(double i=1;i<=60;i++)
    {
        DDA(x0,y0,x1,y1,gl);
        y0+=0.01;
        y1+=0.01;

    }}   
    public void a3(GL2 gl){y0 = 0.7;
    y1 = 0.9;
    x0 = -0.25;
    x1 = 0.25;
    for(double i=1;i<=10;i++)
    {
        DDA(x0,y0,x1,y1,gl);
        y0+=0.01;
        y1+=0.01;

    }}   
    public void a4(GL2 gl){    y0 = 0.09;
    y1 = 0.6;
    x0 = 0.25;
    x1 = 0.3;
    for(double i=1;i<=60;i++)
    {
        DDA(x0,y0,x1,y1,gl);
        y0+=0.01;
        y1+=0.01;

    }}   
    public void a5(GL2 gl){    y0 = 0.0;
    y1 = -0.51;
    x0 = 0.25;
    x1 = 0.3;
    for(double i=1;i<=60;i++)
    {
        DDA(x0,y0,x1,y1,gl);
        y0-=0.01;
        y1-=0.01;
    }}   
   
    public void a6(GL2 gl){
        y0 = 0;
        y1 = -0.51;
        x0 = -0.3;
        x1 = -0.25;
        for(double i=1;i<=60;i++)
        {
            DDA(x0,y0,x1,y1,gl);
            y0-=0.01;
            y1-=0.01;

        }}
   
    public void a7(GL2 gl){    y0 = -0.58;
    y1 = -0.63;
    x0 = -0.25;
    x1 = 0.25;
    for(double i=1;i<=10;i++)
    {
        DDA(x0,y0,x1,y1,gl);
        y0-=0.01;
        y1-=0.01;

    }
    }   
    public void a8(GL2 gl){
    a=.25+.05;
    b=.25+.5;
    c=0.7;
    d=0.9;
    for(double i=1;i<=10;i++)
    {
        DDA(a,c,b,d,gl);
        c+=0.01;
        d+=0.01;

    }}   
    public void a9(GL2 gl){    y0 = 0.09;
    y1 = 0.6;
    x0 = .25+.5;
    x1 = x0+.05;
    for(double i=1;i<=60;i++)
    {
        DDA(x0,y0,x1,y1,gl);
        y0+=0.01;
        y1+=0.01;

    }}   
   
    public void a10(GL2 gl){   
        a=0.25+.05;
    b=.25+.5;
 c=0;
    d=0.5;
    for(double i=1;i<=10;i++)
    {
        DDA(a,c,b,d,gl);
        c+=0.01;
        d+=0.01;

    }}   
    public void a11(GL2 gl){
        y0 = 0.0;
        y1 = -0.51;
        x0 =.25+.5;
        x1 = x0+.05;
        for(double i=1;i<=60;i++)
        {
            DDA(x0,y0,x1,y1,gl);
            y0-=0.01;
            y1-=0.01;

        }   
    }
    public void a12(GL2 gl){   
        a=.25+.05;
    b=.25+.5;
    c=-0.69;
    d=-0.61;
    for(double i=1;i<=10;i++)
    {
        DDA(a,c,b,d,gl);
        c+=0.01;
        d+=0.01;

    }}   
    public void a13(GL2 gl){     a=0.25+.05;
     b=.25+.09;
     c=0;
     d=-0.91;
    for(double i=1;i<=60;i++)
    {
        DDA(a,c,b,d,gl);
        c-=0.01;
        d-=0.01;
        a+=0.0075;
        b+=0.0075;

    }}   
    public void a14(GL2 gl){     a=0.75;
     b=a+.05;
     c=0.7;
     d=0;
    for(double i=1;i<=60;i++)
    {
        DDA(a,c,b,d,gl);
        c-=0.01;
        d-=0.01;
        a-=0.0075;
        b-=0.0075;

    }
    }   
    public void a15(GL2 gl){ a=-0.25;
     b=a+.05;
     c=0.7;
     d=0;
    for(double i=1;i<=60;i++)
    {
        DDA(a,c,b,d,gl);
        c-=0.01;
        d-=0.01;
        a+=0.0075;
        b+=0.0075;

    }
    }   
    public void a16(GL2 gl){   
        a=a-.07;
     b=a+.05;
     c=0;
     d=-.70;
    for(double i=1;i<=60;i++)
    {
        DDA(a,c,b,d,gl);
        c-=0.01;
        d-=0.01;
        a-=0.0075;
        b-=0.0075;

    }}   
       
       
       
       
       
       
       
       
    public void DDA(double x0, double y0, double x1, double y1,GL2 gl)
    {

        double m=(y1-y0)/(x1-x0); 
        m=m*0.0001;                        
        gl.glVertex2d(x0,y0);
        while (x0<x1)
        {

            if (m<1)
            {
                x0=x0+0.01;
                y0=m+y0;
            }
            else if(m>1)  {
                y0=y0+0.01;
                x0=(1/m)+x0;
            }
            else
            {
                y0=y0+0.01;
                x0=x0+0.01;
            }

            gl.glVertex2d(x0,y0);         


        }



    }
    public void dispose(GLAutoDrawable arg0) {
        //method body
    }


    public void init(GLAutoDrawable drawable) {
        // method body
        //4. drive the display() in a loop
    }

    public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4) {
        // method body
    }
    //end of main
}//end of classimport javax.media.opengl.GL2;
