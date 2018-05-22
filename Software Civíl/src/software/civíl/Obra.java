package software.civíl;
import java.util.ArrayList;

public class Obra
{
    int codigoObra;
    Planta planta;
    ArrayList< Funcionario > listaFuncionario;
    
    public Obra()
    {
        codigoObra = 0;
        planta = null;
        listaFuncionario = null;
    }
    
    public Obra(int codigoObra, Planta planta, ArrayList<Funcionario> listaFuncionario)
    {
        this.codigoObra = codigoObra;
        this.planta = planta;
        this.listaFuncionario = listaFuncionario;
    }
    
    public void setCodigoObra(int codigoObra)
    {
        this.codigoObra = codigoObra;
    }
    
    public void setPlanta(Planta planta)
    {
        this.planta = planta;
    }
    
    public void setListaFuncionario(ArrayList<Funcionario> listaFuncionario)
    {
        this.listaFuncionario = listaFuncionario;
    }
    
    /*---------------------------------------------------*/
    
    public int getCodigoObra( )
    {
        return codigoObra;
    }
    
    public Planta getPlanta( )
    {
        return planta;
    }
    
    public ArrayList<Funcionario> getListaFuncionario( )
    {
        return listaFuncionario;
    }
    
}
