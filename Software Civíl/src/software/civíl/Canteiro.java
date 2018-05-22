package software.civíl;
import java.util.ArrayList;

public class Canteiro
{
    ArrayList< Obra > obra;
    String endereco;
    int codigoCanteiro;
    
    public Canteiro()
    {
        obra = null;
        endereco = "";
        codigoCanteiro = 0;
    }
    
    public Canteiro(ArrayList< Obra > obra, String endereco, int codigoCanteiro)
    {
        this.obra = obra;
        this.endereco = endereco;
        this.codigoCanteiro = codigoCanteiro;
    }
    
    
    public void setObra(ArrayList< Obra > obra)
    {
        this.obra = obra;
    }
    
    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }
    
    public void setCodigoCanteiro(int codigoCanteiro)
    {
        this.codigoCanteiro = codigoCanteiro;
    }
    
    /*---------------------------------------------------*/
    
    public ArrayList< Obra > getObra( )
    {
        return obra;
    }
    
    public String getEndereco( )
    {
        return endereco;
    }
    
    public int getCodigoCanteiro( )
    {
        return codigoCanteiro;
    }
}
