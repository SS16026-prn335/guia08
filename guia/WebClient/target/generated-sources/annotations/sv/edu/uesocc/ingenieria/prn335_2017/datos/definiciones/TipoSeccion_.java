package sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.Seccion;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-11-23T13:20:40")
@StaticMetamodel(TipoSeccion.class)
public class TipoSeccion_ { 

    public static volatile SingularAttribute<TipoSeccion, String> descripcion;
    public static volatile SingularAttribute<TipoSeccion, Integer> idTipoSeccion;
    public static volatile SingularAttribute<TipoSeccion, String> nombre;
    public static volatile SingularAttribute<TipoSeccion, Boolean> activo;
    public static volatile ListAttribute<TipoSeccion, Seccion> seccionList;

}