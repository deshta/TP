package software.civíl;
public class Material
{
    int quantidade;
    String nomeMaterial;
    int codigoMaterial;
    
    public Material()
    {
        quantidade = 0;
        nomeMaterial = "";
        codigoMaterial = 0;
    }
    
    public Material(int quantidade, String nomeMaterial, int codigoMaterial)
    {
        this.quantidade = quantidade;
        this.nomeMaterial = nomeMaterial;
        this.codigoMaterial = codigoMaterial;
    }
    
    
    public void setQuantidade(int quantidade)
    {
        this.quantidade = quantidade;
    }
    
    public void setNomeMaterial(String nomeMaterial)
    {
        this.nomeMaterial = nomeMaterial;
    }
    
    public void setCodigoMaterial(int codigoMaterial)
    {
        this.codigoMaterial = codigoMaterial;
    }
    
    /*---------------------------------------------------*/
    
    public int getQuantidade( )
    {
        return quantidade;
    }
    
    public String getNomeMaterial( )
    {
        return nomeMaterial;
    }
    
    public int getCodigoMaterial( )
    {
        return codigoMaterial;
    }
}
