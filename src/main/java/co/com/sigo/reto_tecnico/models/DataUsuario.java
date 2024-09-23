package co.com.sigo.reto_tecnico.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataUsuario {
    private String usuario;
    private String contrasena;
    private String tipo;
    private String tipo_identificacion;
    private String identificacion;
    private String codigo_sucursal;
    private String nombres;
    private String apellidos;
    private String nombre_comercial;
    private String ciudad;
    private String direccion;
    private String telefono;
    private String correo_factura;
    private String nombre_contacto;
    private String correo_contacto;
    private String tipo_regimen_IVA;
    private String responsabilidad_fiscal;
    private String indicativo_factura;
    private String telefono_factura;
    private String codgo_postal_factura;


    public static List<DataUsuario> setData(DataTable dataTable) {
        List<DataUsuario> dates = new ArrayList<>();
        List<Map<String, String>> mapInfo = dataTable.asMaps();
        for (Map<String, String> map : mapInfo) {
            dates.add(new ObjectMapper().convertValue(map, DataUsuario.class));
        }
        return dates;
    }
}

