package org.yourorghere;

import com.sun.opengl.util.Animator;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;

/*
    TIERRAFRIA FLORES ERIC
*/

public class Icosaedro implements GLEventListener {

    public static void main(String[] args) {
        Frame frame = new Frame("Icosaedro");
        GLCanvas canvas = new GLCanvas();

        canvas.addGLEventListener(new Icosaedro());
        frame.add(canvas);
        frame.setSize(640, 480);
        final Animator animator = new Animator(canvas);
        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                new Thread(new Runnable() {

                    public void run() {
                        animator.stop();
                        System.exit(0);
                    }
                }).start();
            }
        });
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        animator.start();
    }

    public void init(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();
        System.err.println("INIT GL IS: " + gl.getClass().getName());

        gl.setSwapInterval(1);

        gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        gl.glShadeModel(GL.GL_SMOOTH);
    }
    
    public void display(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        gl.glLoadIdentity();
        gl.glTranslatef(0.0f, -3.5f, -10.0f);

        gl.glBegin(GL.GL_TRIANGLES);
        //TRIANGULO 1
        gl.glColor3f(0.0f,102.0f/255.0f,204.0f/255.0f);
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        
        gl.glColor3f(0.0f,204.0f/255.0f,0.0f);
        gl.glVertex3f(-3.16f, 1.84f, 0.0f);
        
        gl.glColor3f(204.0f/255.0f,204.0f/255.0f,0.0f);
        gl.glVertex3f(-1.82f, 3.18f, 0.0f);
        //TRIANGULO 2
        gl.glColor3f(0.0f,102.0f/255.0f,204.0f/255.0f);
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        
        gl.glColor3f(0.0f,204.0f/255.0f,0.0f);
        gl.glVertex3f(-1.82f, 3.18f, 0.0f);
        
        gl.glColor3f(204.0f/255.0f,204.0f/255.0f,0.0f);
        gl.glVertex3f(1.88f, 3.18f, 0.0f);
        //TRIANGULO 3
        gl.glColor3f(0.0f,102.0f/255.0f,204.0f/255.0f);
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        
        gl.glColor3f(0.0f,204.0f/255.0f,0.0f); 
        gl.glVertex3f(1.88f, 3.18f, 0.0f);
        
        gl.glColor3f(204.0f/255.0f,204.0f/255.0f,0.0f); 
        gl.glVertex3f(3.22f, 1.86f, 0.0f);
        //TRIANGULO 4
        gl.glColor3f(0.0f,102.0f/255.0f,204.0f/255.0f);
        gl.glVertex3f(-3.16f, 1.84f, 0.0f);

        gl.glColor3f(0.0f,204.0f/255.0f,0.0f);       
        gl.glVertex3f(-1.82f, 3.18f, 0.0f);
        
        gl.glColor3f(204.0f/255.0f,204.0f/255.0f,0.0f); 
        gl.glVertex3f(-3.16f, 5.56f, 0.0f);
        //TRIANGULO 5
        gl.glColor3f(0.0f,102.0f/255.0f,204.0f/255.0f);
        gl.glVertex3f(-1.82f, 3.18f, 0.0f);
        
        gl.glColor3f(0.0f,204.0f/255.0f,0.0f);   
        gl.glVertex3f(-3.16f, 5.56f, 0.0f);
        
        gl.glColor3f(204.0f/255.0f,204.0f/255.0f,0.0f); 
        gl.glVertex3f(0.04f, 6.36f, 0.0f);
        //TRIANGULO 6
        gl.glColor3f(204.0f/255.0f,204.0f/255.0f,0.0f);   
        gl.glVertex3f(-1.82f, 3.18f, 0.0f);
        
        gl.glColor3f(0.0f,204.0f/255.0f,0.0f);  
        gl.glVertex3f(1.88f, 3.18f, 0.0f);
        
        gl.glColor3f(0.0f,102.0f/255.0f,204.0f/255.0f);
        gl.glVertex3f(0.04f, 6.36f, 0.0f);
        //TRIANGULO 7
        gl.glColor3f(0.0f,102.0f/255.0f,204.0f/255.0f);
        gl.glVertex3f(1.88f, 3.18f, 0.0f);
        
        gl.glColor3f(0.0f,204.0f/255.0f,0.0f);
        gl.glVertex3f(3.22f, 5.52f, 0.0f);
        
        gl.glColor3f(204.0f/255.0f,204.0f/255.0f,0.0f);   
        gl.glVertex3f(0.04f, 6.36f, 0.0f);
        //TRIANGULO 8
        gl.glColor3f(0.0f,102.0f/255.0f,204.0f/255.0f);
        gl.glVertex3f(1.88f, 3.18f, 0.0f);
        
        gl.glColor3f(0.0f,204.0f/255.0f,0.0f);
        gl.glVertex3f(3.22f, 1.86f, 0.0f);
        
        gl.glColor3f(204.0f/255.0f,204.0f/255.0f,0.0f); 
        gl.glVertex3f(3.22f, 5.52f, 0.0f);
        //TRIANGULO 9
        gl.glColor3f(0.0f,102.0f/255.0f,204.0f/255.0f);
        gl.glVertex3f(-3.16f, 5.56f, 0.0f);
        
        gl.glColor3f(0.0f,204.0f/255.0f,0.0f);
        gl.glVertex3f(0.04f, 6.36f, 0.0f);
        
        gl.glColor3f(204.0f/255.0f,204.0f/255.0f,0.0f); 
        gl.glVertex3f(0.02f, 7.4f, 0.0f);
        //TRIANGULO 10
        gl.glColor3f(0.0f,102.0f/255.0f,204.0f/255.0f);
        gl.glVertex3f(0.04f, 6.36f, 0.0f);
        
        gl.glColor3f(0.0f,204.0f/255.0f,0.0f);
        gl.glVertex3f(0.02f, 7.4f, 0.0f);
       
        gl.glColor3f(204.0f/255.0f,204.0f/255.0f,0.0f); 
        gl.glVertex3f(3.22f, 5.52f, 0.0f);
        gl.glEnd();
        gl.glFlush();
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }
    
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();

        if (height <= 0) { 

            height = 1;
        }
        final float h = (float) width / (float) height;
        gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluPerspective(45.0f, h, 1.0, 20.0);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glLoadIdentity();
    }
}

