import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Soldado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Soldado extends Actor
{
    /**
     * Act - do whatever the Soldado wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String Nombre;
    private int vidas;
    private int energia=100;
    private int balas=80;
    public void Soldado(String NombreJugador)
    {
        Nombre=NombreJugador;
        vidas=10;
        energia=100;
        balas=80;
    }
    public void act() 
    {
        // Add your action code here.
        if(getY()<=380)
            setLocation(getX()+1,getY()+2);
        if(this.isTouching(Enemigo.class))
        {
            Greenfoot.stop();
            vidas=vidas-1;
            System.out.println(vidas);
        }
        if(Greenfoot.isKeyDown("d"))
            move(3);
        if(Greenfoot.isKeyDown("a"))
            move(-3);
        if(Greenfoot.isKeyDown("w"))
        {
            for(int i=1;i<3;i++)
            {
                setLocation(getX()+1,getY()-2);
            }
        }
    }
}
