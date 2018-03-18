import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Escenario extends World
{
    private Soldado jugador;
    private Enemigo TUX;
    public Escenario()
    {
        super(800,400,1,false);
        jugador=new Soldado();
        TUX=new Enemigo(); 
        this.addObject(jugador,10,380);
        this.addObject(TUX,800,365);
    }
}
