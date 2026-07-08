package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(12) // Ejecución secuencial después del APO06
public class Seeder_12_APO07 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_12_APO07(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("APO07")) {
            System.out.println("Iniciando carga de datos de gestión de talento: APO07...");
            cargarAPO07();
            System.out.println("APO07 (Gestión de Recursos Humanos) cargado exitosamente.");
        }
    }

    private void cargarAPO07() {
        // ==========================================
        // INFORMACIÓN GENERAL (ENFOQUE DE RECURSOS HUMANOS Y ALTA DIRECCIÓN)
        // ==========================================
        ProcesoCobit apo07 = new ProcesoCobit();
        apo07.setIdProceso("APO07");
        apo07.setDominio("Alinear, Planificar y Organizar");
        apo07.setAreaPrioritaria("Modelo Core de COBIT");
        apo07.setNombreProceso("Gestionar los recursos humanos");
        apo07.setDescripcionProceso("Proporcionar un enfoque estructurado para asegurar la óptima contratación, capacitación, evaluación del desempeño y retención del personal, garantizando que la empresa cuente con las habilidades necesarias para alcanzar sus metas.");
        apo07.setPropositoProceso("Garantizar que la organización disponga del talento humano especializado necesario para sostener la transición hacia los vehículos conectados, mitigando el riesgo de fuga de talento clave hacia empresas tecnológicas competidoras.");

        apo07.setMetasAlineamiento("AG12: Personal competente y motivado con una comprensión mutua de la tecnología y el negocio.\nAG07: Seguridad de la información y de la infraestructura de procesamiento.");
        apo07.setMetasEmpresariales("EG09: Personal con las habilidades adecuadas y altamente motivado.\nEG01: Portafolio de productos y servicios comerciales competitivos en el mercado.");
        apo07.setMetricasModelo("Métrica 1: Índice de rotación anual del personal asignado a proyectos críticos de desarrollo digital.\nMétrica 2: Porcentaje de colaboradores que cumplen satisfactoriamente con su plan anual de capacitación corporativa.");

        // ==========================================
        // COMPONENTE A: PROCESOS Y ACTIVIDADES DE GESTIÓN HUMANA
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(apo07);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("APO07.01");
        pract01.setNombrePractica("Adquirir y mantener el personal adecuado");
        pract01.setDescripcionPractica("Definir los perfiles de puesto, gestionar los procesos de contratación y asegurar que la carga laboral esté equilibrada para mantener el bienestar de los empleados.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Actualizar de forma anual los perfiles de puesto requeridos para las nuevas divisiones de movilidad digital y servicios conectados."); a1_1.setNivelCapacidadEsperado(2); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Implementar procesos formales de inducción corporativa para que los nuevos empleados comprendan las políticas de seguridad y la cultura institucional."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("APO07.03");
        pract02.setNombrePractica("Mantener las habilidades y competencias del personal");
        pract02.setDescripcionPractica("Desarrollar planes de formación continua para asegurar que el conocimiento de la fuerza laboral se mantenga actualizado frente a los rápidos cambios tecnológicos.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Diseñar programas de capacitación y certificación en nuevas herramientas de gestión y seguridad de la información."); a2_1.setNivelCapacidadEsperado(3); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Establecer un presupuesto corporativo dedicado exclusivamente a la educación continua y asistencia a conferencias de la industria para el personal clave."); a2_2.setNivelCapacidadEsperado(4); a2_2.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("APO07.04");
        pract03.setNombrePractica("Evaluar el desempeño de los empleados");
        pract03.setDescripcionPractica("Medir de forma objetiva la contribución individual de los empleados a los objetivos corporativos, premiando la excelencia y corrigiendo el bajo rendimiento.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Realizar evaluaciones de desempeño semestrales basadas en metas claras y previamente acordadas con cada colaborador."); a3_1.setNivelCapacidadEsperado(3); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Vincular directamente los resultados de la evaluación de desempeño a la estructura de bonos e incentivos corporativos."); a3_2.setNivelCapacidadEsperado(4); a3_2.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        apo07.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(apo07); raci1.setPracticaGestion("APO07.01"); raci1.setRolOrganizacional("Director de Recursos Humanos (CHRO)"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(apo07); raci2.setPracticaGestion("APO07.03"); raci2.setRolOrganizacional("Gerente de Capacitación y Desarrollo"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(apo07); raci3.setPracticaGestion("APO07.04"); raci3.setRolOrganizacional("Líderes de Área / Gerentes de Departamento"); raci3.setNivelResponsabilidad("R");

        apo07.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(apo07); flujo1.setPracticaGestion("APO07.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: Áreas de Operación"); flujo1.setDescripcion("Requerimientos formales de personal y descripciones de puestos vacantes.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(apo07); flujo2.setPracticaGestion("APO07.04"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: Comité de Compensaciones"); flujo2.setDescripcion("Informes consolidados de evaluación de desempeño y recomendaciones de promoción.");

        apo07.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(apo07); hab1.setNombreHabilidad("Gestión del Talento Organizacional"); hab1.setDocumentacionRelacionada("Modelos de Gestión de Recursos Humanos Estratégicos"); hab1.setReferenciaEspecifica("Planificación de la fuerza laboral corporativa y desarrollo de planes de sucesión para puestos críticos.");

        apo07.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS INSTITUCIONALES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(apo07); pol1.setTituloPolitica("Política Corporativa de Contratación y Retención de Talento Digital"); pol1.setDescripcionPolitica("Normativa que establece lineamientos para ofrecer paquetes de compensación competitivos frente al mercado tecnológico, garantizando además un entorno de trabajo que promueva el balance entre la vida personal y laboral."); pol1.setDocumentacionRelacionada("Manual del Colaborador"); pol1.setReferenciaEspecifica("Capítulo de Beneficios y Desarrollo Profesional");

        apo07.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE GESTIÓN HUMANA
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(apo07); cult1.setElementoCultural("Cultura de Aprendizaje Continuo y Mérito"); cult1.setDocumentacionRelacionada("Principios Rectores Corporativos"); cult1.setReferenciaEspecifica("Fomentar un entorno de trabajo donde se valore la iniciativa personal para adquirir nuevos conocimientos y donde los ascensos estén estrictamente fundamentados en el mérito y la demostración de capacidades profesionales.");

        apo07.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(apo07); serv1.setNombreServicioHerramienta("Sistema Central de Gestión de Recursos Humanos Empresarial (HCM / HRIS)");
        Servicio serv2 = new Servicio(); serv2.setProceso(apo07); serv2.setNombreServicioHerramienta("Plataformas Corporativas de Aprendizaje Electrónico (LMS)");

        apo07.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(apo07);
    }
}