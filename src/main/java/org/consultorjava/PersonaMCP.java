package org.consultorjava;

import io.quarkiverse.mcp.server.Tool;
import io.quarkiverse.mcp.server.ToolArg;

public class PersonaMCP {


    @Tool(description = "listar a los propietarios registrados")
        String getPropietarios(@ToolArg(description = "listar propietarios") String inputChat) {
                
            //logica para traer a los propietarios

            return "propietariossss";
        }
    
}
