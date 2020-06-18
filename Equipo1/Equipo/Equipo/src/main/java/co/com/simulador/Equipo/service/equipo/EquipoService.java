package co.com.simulador.Equipo.service.equipo;


import co.com.simulador.Equipo.command.EquipoCommand;
import co.com.simulador.Equipo.model.businessexecption.BusinessExecption;

import java.util.List;

public interface EquipoService {

    String registrarEquipo(EquipoCommand equipoCommand) throws BusinessExecption;

    List<EquipoCommand> listAll();
}
