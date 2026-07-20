package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(7)
public class Seeder_07_APO02 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_07_APO02(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("APO02")) {
            cargarAPO02();
        }
    }

    private void cargarAPO02() {
        ProcesoCobit apo02 = new ProcesoCobit();
        apo02.setIdProceso("APO02");
        apo02.setDominio("Alinear, Planificar y Organizar");
        apo02.setAreaPrioritaria("Modelo Core de COBIT");
        apo02.setNombreProceso("Gestionar la estrategia");
        apo02.setDescripcionProceso("Proporcionar una visión holística del entorno de negocio y de TI actual, la dirección futura y las iniciativas requeridas para migrar al entorno futuro deseado.");
        apo02.setPropositoProceso("Definir la hoja de ruta (Roadmap) tecnológica a 5 años para la transición de Toyota hacia la era de los Vehículos Definidos por Software (SDV), asegurando que la inversión en AWS y Arene OS genere ventaja competitiva.");

        apo02.setMetasAlineamiento("AG05: Entrega de servicios de TI acorde a los requisitos del negocio.\nAG09: Entrega de programas que proporcionen beneficios a tiempo, dentro del presupuesto y cumpliendo los requisitos.");
        apo02.setMetasEmpresariales("EG01: Portafolio de productos y servicios competitivos.\nEG05: Cultura de innovación orientada al cliente.");
        apo02.setMetricasModelo("Métrica 1: Porcentaje de iniciativas estratégicas de TI alineadas con la estrategia corporativa.\nMétrica 2: Nivel de madurez de la arquitectura empresarial TO-BE alcanzado en el año fiscal.");

        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(apo02);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("APO02.01");
        pract01.setNombrePractica("Entender el contexto y la dirección de la empresa");
        pract01.setDescripcionPractica("Comprender el contexto interno y externo de la empresa. Identificar y comprender la estrategia y la dirección de la empresa, los requerimientos del negocio y los retos estratégicos de la I&T.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Desarrollar y mantener un conocimiento del entorno, de las regulaciones externas y de las tendencias del mercado."); a1_1.setNivelCapacidadEsperado(2); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Comprender el entorno de negocio actual y el modelo operativo de la empresa."); a1_2.setNivelCapacidadEsperado(2); a1_2.setCalificacionActual("N");
        Actividad a1_3 = new Actividad(); a1_3.setPractica(pract01); a1_3.setDescripcionActividad("Identificar el entorno actual de I&T, incluyendo los retos estratégicos clave y las expectativas futuras de I&T de la empresa."); a1_3.setNivelCapacidadEsperado(3); a1_3.setCalificacionActual("N");
        Actividad a1_4 = new Actividad(); a1_4.setPractica(pract01); a1_4.setDescripcionActividad("Alinear la dirección de I&T con la dirección estratégica general de la empresa."); a1_4.setNivelCapacidadEsperado(4); a1_4.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2, a1_3, a1_4));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("APO02.04");
        pract02.setNombrePractica("Realizar un análisis de brechas");
        pract02.setDescripcionPractica("Identificar las deficiencias entre el estado actual y el deseado para los procesos de I&T, infraestructura, servicios y cultura, de cara a satisfacer las necesidades del negocio.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Definir la arquitectura base (estado actual) desde la perspectiva de negocio y de I&T."); a2_1.setNivelCapacidadEsperado(2); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Identificar los cambios requeridos en el modelo operativo actual, en la infraestructura y en los servicios para alcanzar la visión."); a2_2.setNivelCapacidadEsperado(3); a2_2.setCalificacionActual("N");
        Actividad a2_3 = new Actividad(); a2_3.setPractica(pract02); a2_3.setDescripcionActividad("Analizar y evaluar opciones alternativas para salvar las brechas identificadas."); a2_3.setNivelCapacidadEsperado(4); a2_3.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2, a2_3));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("APO02.05");
        pract03.setNombrePractica("Definir el plan estratégico y la hoja de ruta");
        pract03.setDescripcionPractica("Definir las iniciativas requeridas para cerrar las brechas y traducirlas a un plan estratégico, junto con una hoja de ruta factible.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Agrupar las brechas identificadas en iniciativas alineadas con las prioridades del negocio."); a3_1.setNivelCapacidadEsperado(2); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Desarrollar y documentar el plan estratégico de I&T para lograr la visión."); a3_2.setNivelCapacidadEsperado(3); a3_2.setCalificacionActual("N");
        Actividad a3_3 = new Actividad(); a3_3.setPractica(pract03); a3_3.setDescripcionActividad("Preparar una hoja de ruta que establezca el plan a alto nivel y la secuencia de despliegue de las iniciativas."); a3_3.setNivelCapacidadEsperado(3); a3_3.setCalificacionActual("N");
        Actividad a3_4 = new Actividad(); a3_4.setPractica(pract03); a3_4.setDescripcionActividad("Asegurar la validación y aprobación del plan estratégico de I&T y de la hoja de ruta por parte del gobierno corporativo."); a3_4.setNivelCapacidadEsperado(4); a3_4.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2, a3_3, a3_4));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        apo02.setComponenteA_Procesos(Arrays.asList(compA));

        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(apo02); raci1.setPracticaGestion("APO02.01"); raci1.setRolOrganizacional("Comité Ejecutivo / CEO"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(apo02); raci2.setPracticaGestion("APO02.04"); raci2.setRolOrganizacional("Arquitecto Jefe de TI (Chief Architect)"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(apo02); raci3.setPracticaGestion("APO02.05"); raci3.setRolOrganizacional("Director de Estrategia Digital"); raci3.setNivelResponsabilidad("R");
        apo02.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(apo02); flujo1.setPracticaGestion("APO02.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: EDM01.01"); flujo1.setDescripcion("Directrices empresariales y contexto competitivo.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(apo02); flujo2.setPracticaGestion("APO02.04"); flujo2.setTipoFlujo("ENTRADA"); flujo2.setOrigenDestino("DE: APO03.02"); flujo2.setDescripcion("Línea base (AS-IS) de la arquitectura tecnológica actual.");
        FlujoInformacion flujo3 = new FlujoInformacion(); flujo3.setProceso(apo02); flujo3.setPracticaGestion("APO02.05"); flujo3.setTipoFlujo("SALIDA"); flujo3.setOrigenDestino("A: APO05.01"); flujo3.setDescripcion("Plan Estratégico de I&T y Roadmap de proyectos OTA.");
        apo02.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2, flujo3));

        Habilidad hab1 = new Habilidad(); hab1.setProceso(apo02); hab1.setNombreHabilidad("Planificación Estratégica (Strategic Planning)"); hab1.setDocumentacionRelacionada("Marco e-CF (European e-Competence Framework)"); hab1.setReferenciaEspecifica("A.1 - Alineamiento de SI y Estrategia de Negocio.");
        Habilidad hab2 = new Habilidad(); hab2.setProceso(apo02); hab2.setNombreHabilidad("Análisis de Negocio (Business Analysis)"); hab2.setDocumentacionRelacionada("BABOK Guide"); hab2.setReferenciaEspecifica("Identificación de necesidades y evaluación de soluciones tecnológicas.");
        apo02.setComponenteD_Habilidades(Arrays.asList(hab1, hab2));

        Politica pol1 = new Politica(); pol1.setProceso(apo02); pol1.setTituloPolitica("Política de Innovación y Estrategia Digital"); pol1.setDescripcionPolitica("Define los principios para priorizar proyectos de software que generen nuevos modelos de negocio (como las suscripciones de Arene OS) por encima de proyectos de mantenimiento de legado."); pol1.setDocumentacionRelacionada("Plan Estratégico Corporativo Toyota"); pol1.setReferenciaEspecifica("Capítulo: Transformación Digital");
        apo02.setComponenteE_Politicas(Arrays.asList(pol1));

        Cultura cult1 = new Cultura(); cult1.setProceso(apo02); cult1.setElementoCultural("Pensamiento Visionario a Largo Plazo"); cult1.setDocumentacionRelacionada("Toyota Way (Filosofía Corporativa)"); cult1.setReferenciaEspecifica("Fomento del principio de 'Desafío' (Challenge): pensar más allá de los vehículos físicos e imaginar el auto como un ecosistema de servicios continuos.");
        apo02.setComponenteF_Cultura(Arrays.asList(cult1));

        Servicio serv1 = new Servicio(); serv1.setProceso(apo02); serv1.setNombreServicioHerramienta("Plataformas de Gestión Estratégica (Aha!, Jira Align)");
        Servicio serv2 = new Servicio(); serv2.setProceso(apo02); serv2.setNombreServicioHerramienta("Herramientas de Modelado Empresarial (ArchiMate, BizzDesign)");
        apo02.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(apo02);
    }
}