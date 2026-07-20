package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(25)
public class Seeder_25_BAI06 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_25_BAI06(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("BAI06")) {
            cargarBAI06();
        }
    }

    private void cargarBAI06() {
        ProcesoCobit bai06 = new ProcesoCobit();
        bai06.setIdProceso("BAI06");
        bai06.setDominio("Construir, Adquirir e Implementar");
        bai06.setAreaPrioritaria("Modelo Core de COBIT");
        bai06.setNombreProceso("Gestionar los cambios de TI");
        bai06.setDescripcionProceso("Gestionar todos los cambios de manera controlada, incluyendo los cambios estándar y el mantenimiento de emergencia relativos a los procesos de negocio, aplicaciones e infraestructura.");
        bai06.setPropositoProceso("Asegurar que cualquier alteración en el código del sistema operativo vehicular o en los servidores centrales corporativos sea meticulosamente analizada por un comité experto antes de su ejecución, evitando el riesgo extremo de inutilizar las unidades automotrices en circulación debido a una actualización defectuosa.");

        bai06.setMetasAlineamiento("AG07: Seguridad de la información, infraestructura de procesamiento y de las aplicaciones.\nAG08: Habilitación y soporte de procesos de negocio mediante la integración de aplicaciones y tecnología.");
        bai06.setMetasEmpresariales("EG06: Continuidad y disponibilidad del servicio de negocio.\nEG01: Portafolio de productos y servicios competitivos.");
        bai06.setMetricasModelo("Métrica 1: Número de cambios fallidos debido a una evaluación de impacto inadecuada.\nMétrica 2: Porcentaje de cambios autorizados implementados según lo previsto.");

        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(bai06);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("BAI06.01");
        pract01.setNombrePractica("Evaluar, priorizar y autorizar los cambios de TI");
        pract01.setDescripcionPractica("Evaluar todos los requerimientos de cambios para determinar el impacto en los procesos de negocio y los servicios de I&T y para evaluar si el cambio afectará de forma adversa al entorno operativo normal y a los otros servicios.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Definir una política formal de gestión de cambios y un procedimiento que abarque el ciclo de vida de los cambios."); a1_1.setNivelCapacidadEsperado(2); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Asegurar que la evaluación del riesgo incluya el impacto sobre la capacidad, el rendimiento, la fiabilidad y la seguridad."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        Actividad a1_3 = new Actividad(); a1_3.setPractica(pract01); a1_3.setDescripcionActividad("Establecer un proceso de aprobación que garantice que los cambios sean autorizados por un rol adecuado (ej., Consejo Asesor de Cambios)."); a1_3.setNivelCapacidadEsperado(3); a1_3.setCalificacionActual("N");
        Actividad a1_4 = new Actividad(); a1_4.setPractica(pract01); a1_4.setDescripcionActividad("Planificar un calendario para la implementación, garantizando una mínima disrupción de los servicios."); a1_4.setNivelCapacidadEsperado(4); a1_4.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2, a1_3, a1_4));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("BAI06.02");
        pract02.setNombrePractica("Gestionar los cambios de emergencia");
        pract02.setDescripcionPractica("Gestionar cuidadosamente los cambios de emergencia para minimizar impactos futuros. Asegurar que el cambio de emergencia se integre de nuevo en el proceso de gestión de cambios ordinario una vez resulta la emergencia.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Definir un proceso documentado para la autorización, evaluación y rápida implementación de cambios de emergencia."); a2_1.setNivelCapacidadEsperado(2); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Garantizar que todos los cambios de emergencia son sometidos a un proceso formal posterior a la implementación para asegurar que se hayan completado los pasos omitidos."); a2_2.setNivelCapacidadEsperado(3); a2_2.setCalificacionActual("N");
        Actividad a2_3 = new Actividad(); a2_3.setPractica(pract02); a2_3.setDescripcionActividad("Monitorizar y analizar periódicamente el volumen de cambios de emergencia e identificar causas fundamentales para reducir la frecuencia."); a2_3.setNivelCapacidadEsperado(4); a2_3.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2, a2_3));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("BAI06.03");
        pract03.setNombrePractica("Hacer seguimiento e informar sobre el estado de los cambios");
        pract03.setDescripcionPractica("Mantener un registro con todos los requerimientos de cambio con su respectiva información de estado. Generar informes del estado de los cambios.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Registrar todos los requerimientos de cambio en el sistema de gestión de servicios (Service Desk o herramienta afín)."); a3_1.setNivelCapacidadEsperado(2); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Realizar un seguimiento continuo de todos los cambios registrados desde su origen hasta su cierre."); a3_2.setNivelCapacidadEsperado(3); a3_2.setCalificacionActual("N");
        Actividad a3_3 = new Actividad(); a3_3.setPractica(pract03); a3_3.setDescripcionActividad("Comunicar y reportar de manera oportuna la planificación de los cambios y su estatus a las partes afectadas y a la dirección."); a3_3.setNivelCapacidadEsperado(3); a3_3.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2, a3_3));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        bai06.setComponenteA_Procesos(Arrays.asList(compA));

        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(bai06); raci1.setPracticaGestion("BAI06.01"); raci1.setRolOrganizacional("Comité Asesor de Cambios Institucionales (CAB)"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(bai06); raci2.setPracticaGestion("BAI06.02"); raci2.setRolOrganizacional("Dirección de Seguridad y Operaciones de Red"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(bai06); raci3.setPracticaGestion("BAI06.03"); raci3.setRolOrganizacional("Gestor General de Transición de Servicios"); raci3.setNivelResponsabilidad("R");
        bai06.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(bai06); flujo1.setPracticaGestion("BAI06.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: BAI03.03"); flujo1.setDescripcion("Paquetes de componentes tecnológicos terminados y solicitudes formales de integración al entorno operativo.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(bai06); flujo2.setPracticaGestion("BAI06.03"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: BAI07.01"); flujo2.setDescripcion("Autorización oficial y programación de fechas para la transición técnica hacia el entorno de producción comercial.");
        bai06.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        Habilidad hab1 = new Habilidad(); hab1.setProceso(bai06); hab1.setNombreHabilidad("Gestión de Configuraciones y Transición de Servicios Tecnológicos"); hab1.setDocumentacionRelacionada("Biblioteca de Infraestructura de Tecnologías de la Información en su cuarta edición"); hab1.setReferenciaEspecifica("De este marco de trabajo corporativo se rescata fundamentalmente el diseño riguroso del ciclo de vida del cambio y la estructuración de comités asesores para evaluar el impacto cruzado entre sistemas críticos antes de su implementación.");
        bai06.setComponenteD_Habilidades(Arrays.asList(hab1));

        Politica pol1 = new Politica(); pol1.setProceso(bai06); pol1.setTituloPolitica("Política Institucional de Congelamiento de Cambios Operativos"); pol1.setDescripcionPolitica("Normativa restrictiva que prohíbe terminantemente realizar alteraciones a los servidores corporativos o enviar actualizaciones a los vehículos durante periodos de altas ventas comerciales o eventos globales de la marca. Esta regla obliga a postergar cualquier actualización que no sea de seguridad vital para garantizar la estabilidad económica y reputacional de la empresa."); pol1.setDocumentacionRelacionada("Manual de Gobierno de Operaciones Continuas"); pol1.setReferenciaEspecifica("Sección: Ventanas de Mantenimiento y Períodos Restringidos");
        bai06.setComponenteE_Politicas(Arrays.asList(pol1));

        Cultura cult1 = new Cultura(); cult1.setProceso(bai06); cult1.setElementoCultural("Cultura de Disciplina y Control Estricto"); cult1.setDocumentacionRelacionada("Directrices de Excelencia Operacional"); cult1.setReferenciaEspecifica("Promover en todo el equipo de ingeniería el entendimiento de que eludir los procedimientos de aprobación formal constituye una falta grave contra la seguridad de los usuarios, erradicando por completo la práctica de realizar alteraciones improvisadas bajo la excusa de agilizar el trabajo.");
        bai06.setComponenteF_Cultura(Arrays.asList(cult1));

        Servicio serv1 = new Servicio(); serv1.setProceso(bai06); serv1.setNombreServicioHerramienta("Plataformas Automatizadas de Gestión de Servicios Tecnológicos y Control de Peticiones");
        Servicio serv2 = new Servicio(); serv2.setProceso(bai06); serv2.setNombreServicioHerramienta("Sistemas de Despliegue de Código Centralizado equipados con Capacidad de Reversión Inmediata");
        bai06.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(bai06);
    }
}