package software.civíl;
public class TipoContato
{
    String nomeTipo;
    int codigoTipoContato;
    
    public TipoContato()
    {
        nomeTipo = "";
        codigoTipoContato = 0;
    }
    
    public TipoContato(String nomeTipo, int codigoTipoContato)
    {
        this.nomeTipo = nomeTipo;
        this.codigoTipoContato = codigoTipoContato;
    }
    
    
    public void setCodigoTipoContato(int codigoTipoContato)
    {
        this.codigoTipoContato = codigoTipoContato;
    }
    
    public void setNomeTipo(String nomeTipo)
    {
        this.nomeTipo = nomeTipo;
    }
    
    /*---------------------------------------------------*/
    
    public int getCodigoTipoContato( )
    {
        return codigoTipoContato;
    }
    
    public String getNomeTipo( )
    {
        return nomeTipo;
    }
}
