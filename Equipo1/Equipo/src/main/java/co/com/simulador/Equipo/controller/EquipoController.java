package co.com.simulador.Equipo.controller;


import co.com.simulador.Equipo.command.EquipoCommand;
import co.com.simulador.Equipo.model.businessexecption.BusinessExecption;
import co.com.simulador.Equipo.service.equipo.EquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController("EquipoController")
@RequestMapping("/equipo")
public class EquipoController {

    @Autowired
    private EquipoService equipoService;

    @PostMapping("/registro")
    public String registrarEquipo() throws BusinessExecption {
        return registrarEquipo();
    }

    @PostMapping("/registro")
    public String registrarEquipo(@RequestBody EquipoCommand equipoCommand) throws BusinessExecption {
        return equipoService.registrarEquipo(equipoCommand);
    }


    @GetMapping("/listado")
    public List<EquipoCommand> listadoEquipos() throws BusinessExecption{
        return equipoService.listAll();
    }
}

