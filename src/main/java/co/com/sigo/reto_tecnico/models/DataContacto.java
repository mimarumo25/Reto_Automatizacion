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
public class DataContacto {
    private String nombre_contacto;
    private String apellidos_contacto;
    private String correo_contacto;
    private String cargo_contacto;
    private String indicativo_contacto;
    private String telefono_contacto;

    public static List<DataContacto> setData(DataTable dataTable) {
        List<DataContacto> dates = new ArrayList<>();
        List<Map<String, String>> mapInfo = dataTable.asMaps();
        for (Map<String, String> map : mapInfo) {
            dates.add(new ObjectMapper().convertValue(map, DataContacto.class));
        }
        return dates;
    }
}
