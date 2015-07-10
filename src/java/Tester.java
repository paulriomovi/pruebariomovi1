
import servicios.DictadoMateriaServicio;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PAUL
 */
public class Tester {
    public static void main(String[] args){
        
        java.util.List<servicios.DictadoMateriaServicio>  lista=
                obtenerDictadoMateriasxProgramaVersion("V0009");
        for(DictadoMateriaServicio dic : lista)
            System.out.println(dic.getNombreprogramaversion());
    }

    private static java.util.List<servicios.DictadoMateriaServicio> obtenerDictadoMateriasxProgramaVersion(java.lang.String codprogversion) {
        servicios.InfoProgramasService service = new servicios.InfoProgramasService();
        servicios.InfoProgramas port = service.getInfoProgramasPort();
        return port.obtenerDictadoMateriasxProgramaVersion(codprogversion);
    }
}
