package software.civíl;
public class Contato
{
    private int codigoContato;
    private TipoContato tipo;
    
    public Contato()
    {
        codigoContato = 0;
        tipo = null;
    }
    
    public Contato(int codigoContato, TipoContato tipo)
    {
        this.codigoContato = codigoContato;
        this.tipo = tipo;
    }
    
    
    public void setCodigoContato(int codigoContato)
    {
        this.codigoContato = codigoContato;
    }
    
    public void setTipo(TipoContato tipo)
    {
        this.tipo = tipo;
    }
    
    /*---------------------------------------------------*/
    
    public int getCodigoContato( )
    {
        return codigoContato;
    }
    
    public TipoContato getArquivo( )
    {
        return tipo;
    }
}
