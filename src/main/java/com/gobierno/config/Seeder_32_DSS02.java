package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(32) // Continuación de la estructura del dominio DSS
public class Seeder_32_DSS02 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_32_DSS02(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("DSS02")) {
            System.out.println("Iniciando carga de datos de gestión de incidentes: DSS02...");
            cargarDSS02();
            System.out.println("DSS02 (Gestión de Peticiones e Incidentes) cargado exitosamente.");
        }
    }

    private void cargarDSS02() {
        // ==========================================
        // INFORMACIÓN GENERAL (ENFOQUE DE RESTAURACIÓN INMEDIATA)
        // ==========================================
        ProcesoCobit dss02 = new ProcesoCobit();
        dss02.setIdProceso("DSS02");
        dss02.setDominio("Entregar, Dar Servicio y Soporte");
        dss02.setAreaPrioritaria("Modelo Core de COBIT");
        dss02.setNombreProceso("Gestionar las peticiones y los incidentes de servicio");
        dss02.setDescripcionProceso("Proporcionar una respuesta oportuna y eficaz a las solicitudes de los usuarios, garantizando la restauración del funcionamiento normal de los sistemas lo antes posible luego de una interrupción, con el objetivo primordial de minimizar el impacto adverso en las operaciones del negocio.");
        dss02.setPropositoProceso("Garantizar que cualquier falla reportada en las herramientas de diagnóstico de los concesionarios o en la conexión telemática de los vehículos sea atendida y resuelta con máxima celeridad, restaurando la productividad comercial y resguardando la confianza del consumidor final.");

        dss02.setMetasAlineamiento("AG08: Soporte operativo constante a los procesos comerciales mediante el uso eficiente de la tecnología.\nAG05: Prestación de servicios informáticos en total concordancia con los acuerdos de calidad documentados.");
        dss02.setMetasEmpresariales("EG06: Continuidad operativa y disponibilidad permanente de los servicios frente al mercado.\nEG01: Portafolio de productos comerciales competitivos y con alto nivel de respaldo técnico.");
        dss02.setMetricasModelo("Métrica 1: Porcentaje de fallas operativas reportadas que fueron resueltas exitosamente durante el primer contacto con la mesa de ayuda corporativa.\nMétrica 2: Tiempo promedio transcurrido desde la recepción del reporte de una falla crítica hasta la restauración total del servicio afectado.");

        // ==========================================
        // COMPONENTE A: PRÁCTICAS Y ACTIVIDADES DE ATENCIÓN
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(dss02);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("DSS02.01");
        pract01.setNombrePractica("Clasificar y registrar las solicitudes y fallas operativas");
        pract01.setDescripcionPractica("Documentar cada llamada o reporte recibido mediante un sistema centralizado, asignando una prioridad de atención basada estrictamente en el daño económico o de seguridad que la falla pueda ocasionar.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Implementar un árbol de decisiones institucional que clasifique automáticamente una pérdida de conexión en los frenos automáticos como una crisis de prioridad máxima sobre cualquier otro reporte administrativo."); a1_1.setNivelCapacidadEsperado(3); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Emitir un comprobante de seguimiento único para cada usuario que reporte una incidencia, garantizando la trazabilidad de su problema desde la recepción hasta la solución."); a1_2.setNivelCapacidadEsperado(2); a1_2.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("DSS02.04");
        pract02.setNombrePractica("Investigar, diagnosticar y asignar los incidentes complejos");
        pract02.setDescripcionPractica("Derivar las fallas que no pueden ser resueltas por el primer nivel de atención telefónica hacia los ingenieros especialistas, manteniendo siempre informado al usuario sobre el progreso.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Establecer protocolos de escalamiento automático que transfieran la responsabilidad del reporte al equipo de desarrollo de software si la falla no ha sido solucionada en las primeras dos horas."); a2_1.setNivelCapacidadEsperado(3); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Consultar la base de conocimiento corporativa para identificar si el problema técnico reportado ya cuenta con una solución preestablecida por la gerencia de arquitectura."); a2_2.setNivelCapacidadEsperado(3); a2_2.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("DSS02.05");
        pract03.setNombrePractica("Resolver el incidente y restablecer el servicio comercial");
        pract03.setDescripcionPractica("Aplicar las correcciones técnicas pertinentes para devolver la operatividad a los sistemas afectados y confirmar con el cliente la culminación del evento.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Ejecutar parches de reparación o reiniciar los servidores caídos siguiendo estrictamente los manuales de recuperación para evitar daños colaterales."); a3_1.setNivelCapacidadEsperado(4); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Contactar al concesionario o usuario final para validar que el sistema ha vuelto a funcionar correctamente antes de cerrar formalmente el expediente del incidente."); a3_2.setNivelCapacidadEsperado(3); a3_2.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        dss02.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(dss02); raci1.setPracticaGestion("DSS02.01"); raci1.setRolOrganizacional("Director de Soporte Técnico a Usuarios"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(dss02); raci2.setPracticaGestion("DSS02.04"); raci2.setRolOrganizacional("Ingenieros Especialistas de Segundo Nivel"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(dss02); raci3.setPracticaGestion("DSS02.05"); raci3.setRolOrganizacional("Gerentes de Atención al Cliente"); raci3.setNivelResponsabilidad("C");

        dss02.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(dss02); flujo1.setPracticaGestion("DSS02.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: DSS01.05"); flujo1.setDescripcion("Alertas generadas por los sistemas de monitoreo y bitácoras de fallas operativas diarias.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(dss02); flujo2.setPracticaGestion("DSS02.05"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: DSS03.01"); flujo2.setDescripcion("Catálogo de incidentes recurrentes documentados para su posterior análisis de problemas estructurales.");

        dss02.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(dss02); hab1.setNombreHabilidad("Gestión de Soporte Técnico y Atención de Crisis Operativas"); hab1.setDocumentacionRelacionada("Biblioteca de Infraestructura de Tecnologías de la Información orientada a la Operación del Servicio"); hab1.setReferenciaEspecifica("De este marco normativo se rescatan las pautas estrictas para la creación de mesas de ayuda multinivel y la estructuración de matrices de escalamiento que eviten la paralización técnica de los problemas complejos.");

        dss02.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS INSTITUCIONALES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(dss02); pol1.setTituloPolitica("Directiva Institucional de Tiempos de Respuesta y Escalamiento Obligatorio"); pol1.setDescripcionPolitica("Normativa corporativa que exige a los analistas de soporte transferir inmediatamente cualquier falla crítica relacionada con la seguridad vehicular hacia los especialistas de ingeniería si no logran resolverla en un plazo máximo de quince minutos. Esta regla prohíbe terminantemente retener reportes graves por falta de pericia técnica."); pol1.setDocumentacionRelacionada("Acuerdos Internos de Nivel de Servicio"); pol1.setReferenciaEspecifica("Sección: Clasificación de Urgencias y Tiempos Máximos Permitidos");

        dss02.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE TRABAJO
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(dss02); cult1.setElementoCultural("Cultura de Empatía Operativa y Sentido de Urgencia"); cult1.setDocumentacionRelacionada("Manifiesto de Servicio y Orientación al Cliente"); cult1.setReferenciaEspecifica("Inculcar en el personal de soporte la comprensión de que detrás de cada reporte tecnológico hay una operación comercial detenida o un usuario frustrado, promoviendo una actitud de empatía constante que priorice la restauración veloz del servicio por encima de los debates burocráticos internos.");

        dss02.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(dss02); serv1.setNombreServicioHerramienta("Plataformas Digitales de Registro de Solicitudes y Gestión de Centros de Contacto");
        Servicio serv2 = new Servicio(); serv2.setProceso(dss02); serv2.setNombreServicioHerramienta("Sistemas de Monitoreo Analítico para la Medición Automática de los Tiempos de Resolución");

        dss02.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(dss02);
    }
}