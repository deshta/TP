package software.civíl;
public class Planta
{
    int codigoPlanta;
    String arquivo;
    
    public Planta()
    {
        codigoPlanta = 0;
        arquivo = "";
    }
    
    public Planta(int codigoPlanta, String arquivo)
    {
        this.codigoPlanta = codigoPlanta;
        this.arquivo = arquivo;
    }
    
    public void setCodigoPlanta(int codigoPlanta)
    {
        this.codigoPlanta = codigoPlanta;
    }
    
    public void setArquivo(String arquivo)
    {
        this.arquivo = arquivo;
    }
    
    /*---------------------------------------------------*/
    
    public int getCodigoPlanta( )
    {
        return codigoPlanta;
    }
    
    public String getArquivo( )
    {
        return arquivo;
    }
}
