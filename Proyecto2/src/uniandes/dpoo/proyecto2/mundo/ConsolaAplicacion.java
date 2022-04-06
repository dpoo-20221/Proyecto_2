package uniandes.dpoo.proyecto2.mundo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

/**
 * @author Usuario
 *
 */
public class ConsolaAplicacion 
{/**
	 * Un mapa con todos los participantes registrados en la aplicacion.
	 */
	private Map<String, Participante> mapaUsuarios;
	
	/**
	 * La lista con todos los proyectos de la aplicacion.
	 */
	private ArrayList<Proyecto> proyectos;
	
	/**
	 * El usuario que va a utilizar la aplicacion.
	 */
	private Participante usuario;
	
	public ConsolaAplicacion()
	{
                mapaUsuarios = new HashMap<>();
                proyectos = new ArrayList<>();
	}
	
	/**
	 * Carga toda la informacion anterior de la aplicacion.
	 */
	public void cargar()
	{
		LoaderAplicacion loader = new LoaderAplicacion();
		this.mapaUsuarios = loader.getParticipantes();
		this.proyectos = loader.getProyectos();
	}
	
	/**
	 * Guarda toda la informacion de los proyectos y de los usuarios.
	 */
	public void guardar()
	{
		new LoaderAplicacion().guardar(proyectos, mapaUsuarios);
	}

	/**
	 * Permite y verifica el ingreso de un usuario a la aplicacion.
	 */
	public void ingreso(String nombre, String correo) throws Exception
	{
		if(nombre.equals("") || correo.equals(""))
        {
			throw new Exception("Ingrese un nombre y un correo");
        }
        else
        {
        	if(correo.contains("@") && correo.contains("."))
        	{
        		if(mapaUsuarios.containsKey(correo))
                {
            		if(mapaUsuarios.get(correo).getNombre().equalsIgnoreCase(nombre))
            		{
            			usuario = mapaUsuarios.get(correo);
                        System.out.println("Usuario ingresado con exito");
            		}
            		else 
            		{
            			throw new Exception("Este correo ya se encuentra registrado a otro usuario, intente con otro correo o cambie el nombre");
            		}
                }
            	else
            	{
            		crearParticipante(nombre, correo);
                	System.out.println("Usuario creado con exito");
                }
        	}
        	else
        	{
        		throw new Exception("Ingrese un correo valido");
        	}
         }
	}
	
	/**
	 * Crea un nuevo participante y lo agrega al mapa de usuarios.
	 * @param pNombre Nombre del participante.
	 * @param pCorreo Correo del participante.
	 * @return El participante que se creo.
	 */
	public Participante crearParticipante(String pNombre, String pCorreo)
	{
		usuario = new Participante(pNombre, pCorreo);
		mapaUsuarios.put(pCorreo, usuario);
		return usuario;
	}
	
	/**
	 * Crea un proyecto nuevo.
	 * @param pNombre El nombre del proyecto.
	 * @param pFechaInicio La fecha de inicio del proyecto.
	 * @param pFechaFinal La fecha de finalizacion o tentativa de finalizacion del proyecto.
	 * @param pParticipante El participante que creo el proyecto.
	 * @param pDescripcion La descripcion del proyecto.
	 * @param pTiposDisponibles La lista con los tipos de actividades disponibles del proyecto.
	 * @return
	 */
	public Proyecto crearProyectoCompletado(String pNombre, LocalDateTime pFechaInicio, LocalDateTime pFechaFinal, Participante pParticipante,
			String pDescripcion, ArrayList<String> pTiposDisponibles)
	{
		Proyecto proyecto = new Proyecto(pNombre, pFechaInicio, pFechaFinal,pParticipante, pDescripcion, pTiposDisponibles);
		proyectos.add(proyecto);
		return proyecto;
	}
	
	/**
	 * Crea un proyecto nuevo.
	 * @param pNombre El nombre del proyecto.
	 * @param pFechaInicio La fecha de inicio del proyecto.
	 * @param pParticipante El participante que creo el proyecto.
	 * @param pDescripcion La descripcion del proyecto.
	 * @param pTiposDisponibles La lista con los tipos de actividades disponibles del proyecto.
	 * @return
	 */
	public Proyecto crearProyectoPendiente(String pNombre, LocalDateTime pFechaInicio, Participante pParticipante,
			String pDescripcion, ArrayList<String> pTiposDisponibles)
	{
		Proyecto proyecto = new Proyecto(pNombre, pFechaInicio,pParticipante, pDescripcion, pTiposDisponibles);
		proyectos.add(proyecto);
		return proyecto;
	}
	
	
	/**
	 * Agrega al mapa de usuarios un nuevo participante.
	 * @param participante El participante a ser agregado.
	 */
	public void agregarParticipante(Participante participante)
	{
		mapaUsuarios.put(participante.getCorreo(), participante);
	}
        
        public ArrayList<Proyecto> getProyectos()
        {
            return this.proyectos;
        }
        
        public Map<String, Participante> getMapaUsuarios()
        {
            return this.mapaUsuarios;
        }
        
        public Proyecto buscarProyectoPorNombre(String nombre)
        {
            Proyecto resp = null;
            for(Proyecto p:proyectos)
            {
                if(p.getNombre().equals(nombre))
                {
                   resp = p; 
                }
            }
            return resp;
        }
	
	/**
	 * Agrega a la lista de proyectos un nuevo proyecto.
	 * @param proyecto El proyecto a ser agregado.
	 */
	public void agregarProyecto(Proyecto proyecto)
	{
		proyectos.add(proyecto);
	}
}
