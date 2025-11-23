package org.consultorjava;

import java.util.List;

import io.quarkiverse.mcp.server.Tool;
import io.quarkiverse.mcp.server.ToolArg;

public class PersonaMCP {


   /*  @Tool(description = "listar a los propietarios registrados")
        String getPersonas(@ToolArg(description = "listar propietarios") String inputChat) {
                
            //logica para traer a los propietarios
            Persona.listAll();

            return "personas registradas";
        }*/
    
     @Tool(description = "listar a los propietarios registrados")
        public List<Persona> getAll(@ToolArg(description = "listar personas") String inputChat) {
        return Persona.listAll();
    }


       
}
