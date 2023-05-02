package com.sinfloo.ejemplo01.controlador;

import com.sinfloo.ejemplo01.DTO.Respuestas_Indicadores;
import com.sinfloo.ejemplo01.DTO.Respuestas_Indicadores_Preguntas;
import com.sinfloo.ejemplo01.DTO.Respuestas_Indicadores_Preguntas_Service;
import com.sinfloo.ejemplo01.DTO.Respuestas_Indicadores_Service;
import com.sinfloo.ejemplo01.entidades.Dimension;
import com.sinfloo.ejemplo01.entidades.Encuestado;
import com.sinfloo.ejemplo01.entidades.Estadio_Descripcion;
import com.sinfloo.ejemplo01.entidades.Estadio_Nombre;
import com.sinfloo.ejemplo01.entidades.Indicador;
import com.sinfloo.ejemplo01.entidades.Usuario;
import com.sinfloo.ejemplo01.entidades.*;
import com.sinfloo.ejemplo01.services.DimensionService;
import com.sinfloo.ejemplo01.services.EncuestadoService;
import com.sinfloo.ejemplo01.services.Estadio_Descripcion_Service;
import com.sinfloo.ejemplo01.services.Estadio_Nombre_Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sinfloo.ejemplo01.services.IndicadorService;
import com.sinfloo.ejemplo01.services.UsuarioService;
import com.sinfloo.ejemplo01.services.*;

//como agreglar el problema de cros: https://www.youtube.com/watch?v=ZkSO_wW2Wuw
@CrossOrigin
@RestController
@RequestMapping({"/consultas"})
public class Controlador {

    //Obtenemos e ingresamo datos en la tabla "respuestas_indicadores" que tiene los indicadores respondidos por el usuario
    @Autowired
    Respuestas_Indicadores_Service serviceRespuestas_Indicadores_Servicee;

    @GetMapping("/respuestasIndicadores")
    public List<Respuestas_Indicadores> listarRespestasIndicadores() {
        return serviceRespuestas_Indicadores_Servicee.listarRespuestaIndicador();
    }

    @PostMapping("/insertarRespuestasIndicadores")
    public Respuestas_Indicadores agregarRespuestasIndicadores(@RequestBody Respuestas_Indicadores p) {
        return serviceRespuestas_Indicadores_Servicee.insertarRespuestaIndicador(p);
    }
    
    @GetMapping(path = {"/respuestasIndicadoresId/{id}"})
    public Respuestas_Indicadores listarIdRespuestasIndicador(@PathVariable("id") int id) {
        return serviceRespuestas_Indicadores_Servicee.listarID(id);
    }
    
    @PutMapping(path = {"/actualizarRespuestasIndicadores/{id}"})//https://www.youtube.com/watch?v=-nzB6HIiGqQ
    public Respuestas_Indicadores editarRespuestasIndicador(@RequestBody Respuestas_Indicadores p, @PathVariable("id") int id) {
        p.setRespuestas_Indicadores_ID(id);
        return serviceRespuestas_Indicadores_Servicee.editar(p);
    }
    
    @DeleteMapping(path = {"/eliminarRespuestasIndicadores/{id}"})
    public Respuestas_Indicadores eliminarRespuestasIndicador(@PathVariable("id") int id) {
        return serviceRespuestas_Indicadores_Servicee.eliminar(id);
    }

    //Obtenemos e ingresamo datos en la tabla "respuestas_indicadores_preguntas" que tiene las respuesas de a
    //las preguntas de los indicadores seleccionados por el usuario
    @Autowired
    Respuestas_Indicadores_Preguntas_Service serviceRespuestas_Indicadores_Preguntas_Service;

    @GetMapping("/respuestasIndicadoresPreguntas")
    public List<Respuestas_Indicadores_Preguntas> listarRespestasIndicadoresPreguntasa() {
        return serviceRespuestas_Indicadores_Preguntas_Service.listarRespuestasIndicadoresPreguntas();
    }

    @PostMapping("/insertarIndicadoresPreguntas")
    public Respuestas_Indicadores_Preguntas agregarRespestasIndicadoresPreguntas(@RequestBody Respuestas_Indicadores_Preguntas p) {
        return serviceRespuestas_Indicadores_Preguntas_Service.instatarRespuestasIndicadoresPreguntas(p);
    }
    
    @GetMapping(path = {"/respuestasIndicadoresPreguntasId/{id}"})
    public Respuestas_Indicadores_Preguntas listarIdRespuestasIndicadorId(@PathVariable("id") int id) {
        return serviceRespuestas_Indicadores_Preguntas_Service.listarID(id);
    }

    
    @PutMapping(path = {"/actualizarRespuestasIndicadoresPregutas/{id}"})//https://www.youtube.com/watch?v=-nzB6HIiGqQ
    public Respuestas_Indicadores_Preguntas editarRespuestasIndicadorPreguntas(@RequestBody Respuestas_Indicadores_Preguntas p, @PathVariable("id") int id) {
        p.setRespuestas_Indicadores_Preguntas_ID(id);
        return serviceRespuestas_Indicadores_Preguntas_Service.editar(p);
    }
    
    @DeleteMapping(path = {"/eliminarRespuestasIndicadoresPreguntas/{id}"})
    public Respuestas_Indicadores_Preguntas eliminarRespuestasIndicadorPreguntas(@PathVariable("id") int id) {
        return serviceRespuestas_Indicadores_Preguntas_Service.eliminar(id);
    }
    //____________________________
    @Autowired
    Encuestado_Pregunta_CualitativaService serviceEncuestado_Pregunta_CualitativaService;

    @Autowired
    IndicadorService serviceIndicadores;

    @Autowired
    Preguntas_Cualitativas_Service servicePreguntasCualitativas;

    @Autowired
    TemaService serviceTema;

    @Autowired
    NivelSerivice serviceNivel;

    @Autowired
    EncuestadoService serviceEncuestado;
    
    @Autowired
    AdministradorService serviceAdmnistrador;

    @Autowired
    UsuarioService serviceUsuario;

    @Autowired
    IndicadorService serviceIndicador;

    @Autowired
    Estadio_Nombre_Service serviceEstadioNombre;

    @Autowired
    Estadio_Descripcion_Service serviceDescripcionNombre;

    @Autowired
    DimensionService serviceDimension;

    @Autowired
    ValoresService serviceValores;

    @Autowired
    Valores_Indicadores_Service serviceValoresIndicadores;

    @Autowired
    EstandarService serivceEstandar;
    
    @Autowired
    EmpresaService serviceEmpresa;
    
    @Autowired
    Retroalimentacion_Puntaje_GeneralService serviceRetroalimentacionPuntageGeneral;
    
    @Autowired
    Preguntas_Cualitativas_IndicadorService servicePreguntas_Culitativas_Indicador;

    //______________Estandar INICIO________________
    @GetMapping("/listarEstandares")
    public List<Estandar> listarEstandares() {
        return serivceEstandar.listarEstandares();
    }

    @PostMapping("/insertarEstandar")
    public Estandar agregarEstandar(@RequestBody Estandar p) {
        return serivceEstandar.insertarEstandar(p);
    }

    @GetMapping(path = {"/estandarId/{id}"})
    public Estandar listarIdEstandar(@PathVariable("id") int id) {
        return serivceEstandar.listarID(id);
    }

    @PutMapping(path = {"/actualizarEstandar/{id}"})//https://www.youtube.com/watch?v=-nzB6HIiGqQ
    public Estandar editarEstandar(@RequestBody Estandar p, @PathVariable("id") int id) {
        p.setEstandar_ID(id);
        return serivceEstandar.editar(p);
    }
    @DeleteMapping(path = {"/eliminarEstandar/{id}"})
    public Estandar eliminarEstandar(@PathVariable("id") int id) {
        return serivceEstandar.eliminar(id);
    }
    //______________Estandar FIN________________

    @DeleteMapping("/eliminarValoresIndicadores")
    public void eliminarvaloresIndicadores() {
        serviceValoresIndicadores.eliminarValoresIndicadores();
    }

    @GetMapping("/valoresIndicadores")
    public List<Valores_Indicadores> listarvaloresIndicadores() {
        return serviceValoresIndicadores.listarValoresIndicadores();
    }

    @PostMapping("/insertarValoresIndicadores")
    public Valores_Indicadores agregarValores(@RequestBody Valores_Indicadores p) {
        return serviceValoresIndicadores.insertarValoresIndicadores(p);
    }

    @DeleteMapping("/eliminarValores")
    public void eliminarvalores() {
        serviceValores.eliminarDatos();
    }

    @GetMapping("/valores")
    public List<Valores> listarvalores() {
        return serviceValores.listarValores();
    }

    @PostMapping("/insertarValores")
    public Valores agregarValores(@RequestBody Valores p) {
        return serviceValores.insertarValore(p);
    }

    @GetMapping("/respuestasEncuestado")
    public List<Encuestado_Pregunta_Cualitativa> listarRespuestasEncuestado() {
        return serviceEncuestado_Pregunta_CualitativaService.listarEncuestado_Pregunta_Cualitativa();
    }

    @PostMapping("/insertaRespuestaEncuestado")
    public Encuestado_Pregunta_Cualitativa agregarRespuestaEncuestado(@RequestBody Encuestado_Pregunta_Cualitativa p) {
        return serviceEncuestado_Pregunta_CualitativaService.insertarEncuestado_Pregunta_Cualitativa(p);
    }
    //____________ Preguntas Cualitatitvas INICIO ___________________
    @GetMapping("/preguntasCualitativas")
    public List<Preguntas_Cualitativas> listarPreguntasCualitativas() {
        return servicePreguntasCualitativas.listarPreguntasCualitativas();
    }
    
    @PostMapping("/insertarPreguntasCualitativas")
    public Preguntas_Cualitativas agregarPregunatasCulialitativas(@RequestBody Preguntas_Cualitativas p) {
        return servicePreguntasCualitativas.insertarPreguntasCualitativas(p);
    }
    
    @GetMapping(path = {"/preguntasCualitativasId/{id}"})
    public Preguntas_Cualitativas listarIdPreguntasCualitativas(@PathVariable("id") int id) {
        return servicePreguntasCualitativas.listarID(id);
    }
    
    @PutMapping(path = {"/actualizarPreguntasCualitativas/{id}"})
    public Preguntas_Cualitativas editarEstandar(@RequestBody Preguntas_Cualitativas p, @PathVariable("id") int id) {
        p.setPregunta_Cualitativa_ID(id);
        return servicePreguntasCualitativas.editar(p);
    }
    
    @DeleteMapping(path = {"/eliminarPreguntasCualitativas/{id}"})
    public Preguntas_Cualitativas eliminarPreguntasCualitativas(@PathVariable("id") int id) {
        return servicePreguntasCualitativas.eliminar(id);
    }
    
    //____________ Preguntas Cualitatitvas FIN ___________________ 
    //____________ Preguntas Cualitativas Indicador Inicio _______
    @GetMapping("/preguntasCualitativasIndicador")
    public List<Preguntas_Cualitativas_Indicador> listarPreguntasCualitativasInidcador() {
        return servicePreguntas_Culitativas_Indicador.listarPreguntas_Culitativas_Inidador();
    }
    
    @PostMapping("/insertarPreguntasCualitativasIndicador")
    public Preguntas_Cualitativas_Indicador agregarPreguntasCualitativasIndicador(@RequestBody Preguntas_Cualitativas_Indicador p) {
        return servicePreguntas_Culitativas_Indicador.insertarPregunta_Cualitativa_Indicador(p);
    }
    
    @GetMapping(path = {"/preguntasCualitativasIndicadorId/{id}"})
    public Preguntas_Cualitativas_Indicador listarIdPreguntasCualitativasIndicador(@PathVariable("id") int id) {
        return servicePreguntas_Culitativas_Indicador.listarID(id);
    }
    
    @PutMapping(path = {"/actualizarPreguntasCualitativasIndicador/{id}"})
    public Preguntas_Cualitativas_Indicador editarEstandar(@RequestBody Preguntas_Cualitativas_Indicador p, @PathVariable("id") int id) {
        p.setIndicador_Preguntas_Cualitativas_ID(id);
        return servicePreguntas_Culitativas_Indicador.editar(p);
    }
    
    @DeleteMapping(path = {"/eliminarPreguntasCualitativasIndicador/{id}"})
    public Preguntas_Cualitativas_Indicador eliminarPreguntasCualitativasIndicador(@PathVariable("id") int id) {
        return servicePreguntas_Culitativas_Indicador.eliminar(id);
    }
    //____________ Preguntas Cualitativas Indicador Fin _______

    //____________Indicadores INICIO__________________
    //@GetMapping("/indicadores")
    @GetMapping("/listarIndicadores")
    public List<Indicador> listarIndicadores() {
        return serviceIndicador.listarIndicador();
    }

    @PostMapping("/insertarIndicador")
    public Indicador agregarTemas(@RequestBody Indicador p) {
        return serviceIndicador.ingresarIndicador(p);
    }

    @GetMapping(path = {"/indicadorId/{id}"})
    public Indicador listarIdIndicador(@PathVariable("id") int id) {
        return serviceIndicador.listarID(id);
    }
    
    @PutMapping(path = {"/actualizarIndicador/{id}"})//https://www.youtube.com/watch?v=-nzB6HIiGqQ
    public Indicador editarEstandar(@RequestBody Indicador p, @PathVariable("id") int id) {
        p.setIndicador_ID(id);
        return serviceIndicador.editar(p);
    }
    
    @DeleteMapping(path = {"/eliminarIndicador/{id}"})
    public Indicador eliminarIndicador(@PathVariable("id") int id) {
        return serviceIndicador.eliminar(id);
    }
    //____________Indicadores FIN__________________
    //_____________Tema INCIO________________________
    @GetMapping("/listarTemas")
    public List<Tema> listarTemas() {
        return serviceTema.listarTema();
    }

    @PostMapping("/insertarTema")
    public Tema agregarTemas(@RequestBody Tema p) {
        return serviceTema.insertarTema(p);
    }
    
    @GetMapping(path = {"/temaId/{id}"})
    public Tema listarIdTema(@PathVariable("id") int id) {
        return serviceTema.listarID(id);
    }
    @PutMapping(path = {"/actualizarTema/{id}"})//https://www.youtube.com/watch?v=-nzB6HIiGqQ
    public Tema editarEstandar(@RequestBody Tema p, @PathVariable("id") int id) {
        p.setTema_ID(id);
        return serviceTema.editar(p);
    }
    @DeleteMapping(path = {"/eliminarTema/{id}"})
    public Tema eliminarTema(@PathVariable("id") int id) {
        return serviceTema.eliminar(id);
    }
    //_____________Tema INCIO________________________
    //____________Dimension INICIO___________________
    @GetMapping("/listarDimensiones")
    public List<Dimension> listarDimensiones() {
        return serviceDimension.listarDimensiones();
    }

    @PostMapping("/insertarDimension")
    public Dimension agregarDimensionces(@RequestBody Dimension p) {
        return serviceDimension.insertarDimension(p);
    }
    
    @GetMapping(path = {"/dimensionId/{id}"})
    public Dimension listarIdDimension(@PathVariable("id") int id) {
        return serviceDimension.listarID(id);
    }
    @PutMapping(path = {"/actualizarDimension/{id}"})//https://www.youtube.com/watch?v=-nzB6HIiGqQ
    public Dimension editarEstandar(@RequestBody Dimension p, @PathVariable("id") int id) {
        p.setDimension_ID(id);
        return serviceDimension.editar(p);
    }
    @DeleteMapping(path = {"/eliminarDimension/{id}"})
    public Dimension eliminarDimension(@PathVariable("id") int id) {
        return serviceDimension.eliminar(id);
    }
    //____________Dimension FIN___________________
    //______ USUARIOS_____________
    @PostMapping("/insertarUsuario")
    public Usuario agregarUsuario(@RequestBody Usuario p) {
        return serviceUsuario.insertarUsuario(p);
    }

    @GetMapping("/usuarios")
    public List<Usuario> listarUsuarios() {
        return serviceUsuario.listarUsuarios();
    }

    @GetMapping(path = {"/usuarioId/{id}"})
    public Usuario listarIdUsuario(@PathVariable("id") int id) {
        return serviceUsuario.listarID(id);
    }

    @PutMapping(path = {"/actualizarUsuario/{id}"})//https://www.youtube.com/watch?v=-nzB6HIiGqQ
    public Usuario editarUsuario(@RequestBody Usuario p, @PathVariable("id") int id) {
        p.setUsuario_ID(id);
        return serviceUsuario.editar(p);
    }

    @DeleteMapping(path = {"/eliminarUsuario/{id}"})
    public Usuario eliminarUsuario(@PathVariable("id") int id) {
        return serviceUsuario.eliminar(id);
    }

    //_______________ Encuestado INICIO _________________
    @GetMapping("/encuestados")
    public List<Encuestado> listarEncuestado() {
        return serviceEncuestado.listarEncuesatdos();
    }
    //_______________ Encuestado FIN _________________

    //_______________ Administrador INICIO _________________
    @GetMapping("/administradores")
    public List<Administrador> listarserviceAdmnistrador() {
        return serviceAdmnistrador.listarAdministrador();
    }
    //_______________ Administrador FIN _________________
    
    @GetMapping
    public List<Indicador> listarIndocadores() {
        return serviceIndicador.listarIndicador();
    }

    @GetMapping("/estNom")
    public List<Estadio_Nombre> listarEstadioNombres() {
        return serviceEstadioNombre.listarEstadioNombreDescripcion();
    }

    @GetMapping("/estDes")
    public List<Estadio_Descripcion> listarEstadioDescrpciones() {
        return serviceDescripcionNombre.listarDescrpcionesNombres();
    }

    @PostMapping
    public Indicador agregarIndicador(@RequestBody Indicador p) {
        return serviceIndicador.ingresarIndicador(p);
    }

    //_____________Nivel INICIO__________________
    @GetMapping("/listarNiveles")
    public List<Nivel> listarNiveles() {
        return serviceNivel.listarNivel();
    }

    @PostMapping("/insertarNiveles")
    public Nivel agregarNivel(@RequestBody Nivel p) {
        return serviceNivel.insertarNivel(p);
    }
    @GetMapping(path = {"/nivelId/{id}"})
    public Nivel listarIdNivel(@PathVariable("id") int id) {
        return serviceNivel.listarID(id);
    }
    
    @PutMapping(path = {"/actualizarNivel/{id}"})//https://www.youtube.com/watch?v=-nzB6HIiGqQ
    public Nivel editarEstandar(@RequestBody Nivel p, @PathVariable("id") int id) {
        p.setNivel_ID(id);
        return serviceNivel.editar(p);
    }
    @DeleteMapping(path = {"/eliminarNivel/{id}"})
    public Nivel eliminarNivel(@PathVariable("id") int id) {
        return serviceNivel.eliminar(id);
    }
    //_____________Nivel FIN__________________
    //______________Empresa INICIO_______________
    @GetMapping("/empresas")
    public List<Empresa> listarEmpresas() {
        return serviceEmpresa.listarEmpresas();
    }
    
    @PostMapping("/insertarEmpresa")
    public Empresa agregarEmpresa(@RequestBody Empresa p) {
        return serviceEmpresa.insertarEmpresa(p);
    }
    
    @GetMapping(path = {"/empresaId/{id}"})
    public Empresa listarEmpresaID(@PathVariable("id") int id) {
        return serviceEmpresa.listarEmpresaID(id);
    }
    
    @PutMapping(path = {"/actualizarEmpresa/{id}"})
    public Empresa editarEmpresa(@RequestBody Empresa p, @PathVariable("id") int id) {
        p.setEmpresa_ID(id);
        return serviceEmpresa.editarEmpresa(p);
    }
    
    @DeleteMapping(path = {"/eliminarEmpresa/{id}"})
    public Empresa eliminarEmpresa(@PathVariable("id") int id) {
        return serviceEmpresa.eliminarEmpresa(id);
    }
    //______________Empresa FIN__________________
    
    //________________Retroalimentacion PUNTAJE GENERAL inicio____________________
    @GetMapping("/retroaliemntacionPuntjeGeneral")
    public List<Retroalimentacion_Puntaje_Genaral> listarRetroalimentaciones_Puntaje_General() {
        return serviceRetroalimentacionPuntageGeneral.listarRetroalimentacion_Puntaje_General();
    }
    
    @GetMapping(path = {"/retroaliemntacionPuntjeGeneralId/{id}"})
    public Retroalimentacion_Puntaje_Genaral listarRetroalimentaciones_Puntaje_GeneralID(@PathVariable("id") int id) {
        return serviceRetroalimentacionPuntageGeneral.listarID(id);
    }
    //________________Retroalimentacion PUNTAJE GENERAL fin____________________
    
}
