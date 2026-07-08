package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(16) // Ejecución secuencial en la base de datos
public class Seeder_16_APO11 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_16_APO11(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("APO11")) {
            System.out.println("Iniciando carga de datos de control de calidad: APO11...");
            cargarAPO11();
            System.out.println("APO11 (Gestión de la Calidad) cargado exitosamente.");
        }
    }

    private void cargarAPO11() {
        // ==========================================
        // INFORMACIÓN GENERAL (ENFOQUE DE EXCELENCIA Y SEGURIDAD)
        // ==========================================
        ProcesoCobit apo11 = new ProcesoCobit();
        apo11.setIdProceso("APO11");
        apo11.setDominio("Alinear, Planificar y Organizar");
        apo11.setAreaPrioritaria("Modelo Core de COBIT");
        apo11.setNombreProceso("Gestionar la calidad");
        apo11.setDescripcionProceso("Definir y comunicar los requisitos de calidad en todos los procesos, procedimientos y resultados relacionados con la tecnología, permitiendo controles continuos y una cultura de mejora permanente.");
        apo11.setPropositoProceso("Garantizar que toda actualización de software, antes de ser enviada a la flota vehicular de los clientes, supere rigurosas pruebas de rendimiento, seguridad y experiencia de usuario, evitando fallas masivas o bloqueos operativos (Zero-Defect).");

        apo11.setMetasAlineamiento("AG05: Prestación de servicios tecnológicos de acuerdo con los requisitos documentados.\nAG09: Entrega de programas que proporcionen beneficios a tiempo, dentro del presupuesto y cumpliendo estrictamente con los requisitos.");
        apo11.setMetasEmpresariales("EG01: Portafolio de productos comerciales competitivos y seguros.\nEG05: Cultura de innovación orientada al cliente.");
        apo11.setMetricasModelo("Métrica 1: Porcentaje de actualizaciones de software vehicular que requirieron ser revertidas de emergencia debido a fallos de calidad (Rollback).\nMétrica 2: Nivel de satisfacción de los usuarios finales con la fluidez y estabilidad del sistema operativo del vehículo (Arene OS).");

        // ==========================================
        // COMPONENTE A: PRÁCTICAS Y ACTIVIDADES DE ASEGURAMIENTO
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(apo11);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("APO11.01");
        pract01.setNombrePractica("Establecer un sistema de gestión de calidad");
        pract01.setDescripcionPractica("Definir los estándares, métricas y herramientas obligatorias que evaluarán si el código programado por los ingenieros es apto para producción.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Integrar plataformas de análisis de código automatizado para detectar errores humanos antes de que el software sea aprobado."); a1_1.setNivelCapacidadEsperado(3); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Diseñar una matriz de pruebas que cubra el cien por ciento de las funcionalidades críticas del vehículo (frenos automáticos, asistencia de carril)."); a1_2.setNivelCapacidadEsperado(4); a1_2.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("APO11.03");
        pract02.setNombrePractica("Fomentar la mejora continua");
        pract02.setDescripcionPractica("Garantizar que el equipo aprenda de los errores pasados, documentando soluciones para que las fallas de software no se repitan en futuros modelos de vehículos.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Realizar reuniones obligatorias de autopsia técnica (Post-Mortem) después de cualquier incidencia en el sistema operativo central."); a2_1.setNivelCapacidadEsperado(3); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Implementar un buzón de reporte anónimo interno para que los ingenieros puedan advertir sobre riesgos de calidad sin temor a represalias gerenciales."); a2_2.setNivelCapacidadEsperado(3); a2_2.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("APO11.05");
        pract03.setNombrePractica("Medir y supervisar la calidad");
        pract03.setDescripcionPractica("Supervisar de manera continua que las reglas de aseguramiento establecidas se cumplan en el día a día operativo.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Monitorear el tablero de pruebas de carga en los servidores en la nube para asegurar que soportarán las descargas simultáneas de software de millones de vehículos."); a3_1.setNivelCapacidadEsperado(4); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Realizar auditorías sorpresa a los entornos de desarrollo para validar que no se están evadiendo las pruebas obligatorias por presión de tiempo comercial."); a3_2.setNivelCapacidadEsperado(4); a3_2.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        apo11.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(apo11); raci1.setPracticaGestion("APO11.01"); raci1.setRolOrganizacional("Director de Calidad (CQO)"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(apo11); raci2.setPracticaGestion("APO11.03"); raci2.setRolOrganizacional("Líderes de Ingeniería y Pruebas"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(apo11); raci3.setPracticaGestion("APO11.05"); raci3.setRolOrganizacional("Auditoría Interna Tecnológica"); raci3.setNivelResponsabilidad("C");

        apo11.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(apo11); flujo1.setPracticaGestion("APO11.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: EDM01.01"); flujo1.setDescripcion("Principios de gobierno corporativo y tolerancia al riesgo técnico.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(apo11); flujo2.setPracticaGestion("APO11.05"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: BAI02.02"); flujo2.setDescripcion("Guías de diseño seguro, manuales de pruebas obligatorias y métricas de rendimiento aprobadas.");

        apo11.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(apo11); hab1.setNombreHabilidad("Aseguramiento y Control de Calidad de Software"); hab1.setDocumentacionRelacionada("Estándares Internacionales ISO/IEC 25010"); hab1.setReferenciaEspecifica("Experiencia en diseño de casos de prueba, automatización de validaciones y métricas de confiabilidad del sistema.");

        apo11.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS INSTITUCIONALES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(apo11); pol1.setTituloPolitica("Directiva de Tolerancia Cero ante Fallos Críticos (Zero-Defect Policy)"); pol1.setDescripcionPolitica("Normativa institucional que prohíbe terminantemente la autorización de salida al mercado de cualquier versión de software vehicular si las plataformas de prueba detectan una sola advertencia de seguridad severa, sin importar los compromisos comerciales o de marketing asumidos."); pol1.setDocumentacionRelacionada("Manual Operativo del Sistema Arene OS"); pol1.setReferenciaEspecifica("Sección: Criterios de Aceptación y Lanzamiento");

        apo11.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE EXCELENCIA
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(apo11); cult1.setElementoCultural("Cultura de Calidad desde el Diseño (Quality by Design)"); cult1.setDocumentacionRelacionada("Filosofía Corporativa Toyota (Jidoka / Kaizen)"); cult1.setReferenciaEspecifica("Fomentar que el control de calidad no es la última etapa antes de lanzar el producto, sino una responsabilidad inherente de cada ingeniero desde la primera línea de código programada.");

        apo11.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(apo11); serv1.setNombreServicioHerramienta("Plataformas de Análisis Estático de Código y Detección de Vulnerabilidades Automática");
        Servicio serv2 = new Servicio(); serv2.setProceso(apo11); serv2.setNombreServicioHerramienta("Sistemas de Simulación Virtual de Vehículos (Gemelos Digitales) para Pruebas de Estrés");

        apo11.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(apo11);
    }
}