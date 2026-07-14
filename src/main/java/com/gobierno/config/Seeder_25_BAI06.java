package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(25) // Continuación secuencial en el dominio BAI
public class Seeder_25_BAI06 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_25_BAI06(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("BAI06")) {
            System.out.println("Iniciando carga de datos de control de cambios: BAI06...");
            cargarBAI06();
            System.out.println("BAI06 (Gestión de los Cambios de Tecnología) cargado exitosamente.");
        }
    }

    private void cargarBAI06() {
        // ==========================================
        // INFORMACIÓN GENERAL (ENFOQUE DE CONTROL RIGUROSO)
        // ==========================================
        ProcesoCobit bai06 = new ProcesoCobit();
        bai06.setIdProceso("BAI06");
        bai06.setDominio("Construir, Adquirir e Implementar");
        bai06.setAreaPrioritaria("Modelo Core de COBIT");
        bai06.setNombreProceso("Gestionar los cambios de tecnología de la información");
        bai06.setDescripcionProceso("Evaluar, planificar, autorizar y documentar de manera rigurosa todas las modificaciones que se realicen sobre la infraestructura tecnológica operativa, previniendo interrupciones no deseadas en el servicio comercial.");
        bai06.setPropositoProceso("Asegurar que cualquier alteración en el código del sistema operativo vehicular o en los servidores centrales corporativos sea meticulosamente analizada por un comité experto antes de su ejecución, evitando el riesgo extremo de inutilizar las unidades automotrices en circulación debido a una actualización defectuosa.");

        bai06.setMetasAlineamiento("AG07: Seguridad, confiabilidad e integridad permanente de la infraestructura de procesamiento de datos.\nAG08: Habilitación ininterrumpida a los procesos comerciales mediante tecnología.");
        bai06.setMetasEmpresariales("EG06: Continuidad operativa y disponibilidad permanente de los servicios frente al consumidor final.\nEG01: Portafolio de productos comerciales competitivos y sumamente confiables.");
        bai06.setMetricasModelo("Métrica 1: Número de cambios tecnológicos de emergencia realizados para corregir fallas críticas causadas por modificaciones previas mal planificadas.\nMétrica 2: Porcentaje de actualizaciones de software vehicular que pasaron exitosamente por el comité formal de aprobación antes de su despliegue comercial.");

        // ==========================================
        // COMPONENTE A: PRÁCTICAS Y ACTIVIDADES DE APROBACIÓN
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(bai06);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("BAI06.01");
        pract01.setNombrePractica("Evaluar y autorizar las solicitudes de cambio");
        pract01.setDescripcionPractica("Establecer un tribunal técnico y comercial que dictamine si una propuesta de modificación es segura y oportuna para el negocio.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Constituir un comité asesor multidisciplinario que analice el impacto operativo de cada actualización solicitada para el sistema automotriz antes de otorgar el permiso formal de instalación."); a1_1.setNivelCapacidadEsperado(3); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Clasificar las solicitudes de alteración según su nivel de riesgo y criticidad, programando su despliegue exclusivamente durante horarios de baja circulación vehicular para minimizar impactos adversos."); a1_2.setNivelCapacidadEsperado(4); a1_2.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("BAI06.02");
        pract02.setNombrePractica("Gestionar los cambios de emergencia");
        pract02.setDescripcionPractica("Diseñar conductos regulares abreviados que permitan reaccionar ante crisis inminentes sin perder el control documental ni la seguridad.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Diseñar un procedimiento acelerado de aprobación enfocado únicamente en parches de ciberseguridad, garantizando que una amenaza grave pueda ser bloqueada en cuestión de minutos bajo estricta supervisión directiva."); a2_1.setNivelCapacidadEsperado(3); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Exigir que toda intervención de emergencia sea sometida a una auditoría técnica retrospectiva durante las setenta y dos horas posteriores a su ejecución para validar que no generó daños colaterales."); a2_2.setNivelCapacidadEsperado(4); a2_2.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("BAI06.03");
        pract03.setNombrePractica("Supervisar y reportar el estado de las modificaciones");
        pract03.setDescripcionPractica("Mantener una visibilidad absoluta sobre el progreso de las actualizaciones autorizadas para detectar desviaciones en tiempo real.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Monitorear en directo el progreso de las descargas inalámbricas en la flota automotriz para detectar tasas de error anormales, lo cual facultará al equipo de guardia para ordenar la detención inmediata del proceso."); a3_1.setNivelCapacidadEsperado(4); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Mantener un registro histórico inalterable de todos los cambios aplicados en los servidores centrales para facilitar el rastreo de responsabilidades durante futuras auditorías corporativas."); a3_2.setNivelCapacidadEsperado(3); a3_2.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        bai06.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(bai06); raci1.setPracticaGestion("BAI06.01"); raci1.setRolOrganizacional("Comité Asesor de Cambios Institucionales"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(bai06); raci2.setPracticaGestion("BAI06.02"); raci2.setRolOrganizacional("Dirección de Seguridad y Operaciones de Red"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(bai06); raci3.setPracticaGestion("BAI06.03"); raci3.setRolOrganizacional("Gestor General de Transición de Servicios"); raci3.setNivelResponsabilidad("R");

        bai06.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(bai06); flujo1.setPracticaGestion("BAI06.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: BAI03.03"); flujo1.setDescripcion("Paquetes de componentes tecnológicos terminados y solicitudes formales de integración al entorno operativo.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(bai06); flujo2.setPracticaGestion("BAI06.03"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: BAI07.01"); flujo2.setDescripcion("Autorización oficial y programación de fechas para la transición técnica hacia el entorno de producción comercial.");

        bai06.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(bai06); hab1.setNombreHabilidad("Gestión de Configuraciones y Transición de Servicios Tecnológicos"); hab1.setDocumentacionRelacionada("Biblioteca de Infraestructura de Tecnologías de la Información en su cuarta edición"); hab1.setReferenciaEspecifica("De este marco de trabajo corporativo se rescata fundamentalmente el diseño riguroso del ciclo de vida del cambio y la estructuración de comités asesores para evaluar el impacto cruzado entre sistemas críticos antes de su implementación.");

        bai06.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS INSTITUCIONALES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(bai06); pol1.setTituloPolitica("Política Institucional de Congelamiento de Cambios Operativos"); pol1.setDescripcionPolitica("Normativa restrictiva que prohíbe terminantemente realizar alteraciones a los servidores corporativos o enviar actualizaciones a los vehículos durante periodos de altas ventas comerciales o eventos globales de la marca. Esta regla obliga a postergar cualquier actualización que no sea de seguridad vital para garantizar la estabilidad económica y reputacional de la empresa."); pol1.setDocumentacionRelacionada("Manual de Gobierno de Operaciones Continuas"); pol1.setReferenciaEspecifica("Sección: Ventanas de Mantenimiento y Períodos Restringidos");

        bai06.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE TRABAJO
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(bai06); cult1.setElementoCultural("Cultura de Disciplina y Control Estricto"); cult1.setDocumentacionRelacionada("Directrices de Excelencia Operacional"); cult1.setReferenciaEspecifica("Promover en todo el equipo de ingeniería el entendimiento de que eludir los procedimientos de aprobación formal constituye una falta grave contra la seguridad de los usuarios, erradicando por completo la práctica de realizar alteraciones improvisadas bajo la excusa de agilizar el trabajo.");

        bai06.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(bai06); serv1.setNombreServicioHerramienta("Plataformas Automatizadas de Gestión de Servicios Tecnológicos y Control de Peticiones");
        Servicio serv2 = new Servicio(); serv2.setProceso(bai06); serv2.setNombreServicioHerramienta("Sistemas de Despliegue de Código Centralizado equipados con Capacidad de Reversión Inmediata");

        bai06.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(bai06);
    }
}