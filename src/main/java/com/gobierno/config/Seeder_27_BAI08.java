package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(27) // Continuación del despliegue en el dominio BAI
public class Seeder_27_BAI08 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_27_BAI08(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("BAI08")) {
            System.out.println("Iniciando carga de datos de gestión del conocimiento: BAI08...");
            cargarBAI08();
            System.out.println("BAI08 (Gestión del Conocimiento) cargado exitosamente.");
        }
    }

    private void cargarBAI08() {
        // ==========================================
        // INFORMACIÓN GENERAL (ENFOQUE DE INTELIGENCIA CORPORATIVA)
        // ==========================================
        ProcesoCobit bai08 = new ProcesoCobit();
        bai08.setIdProceso("BAI08");
        bai08.setDominio("Construir, Adquirir e Implementar");
        bai08.setAreaPrioritaria("Modelo Core de COBIT");
        bai08.setNombreProceso("Gestionar el conocimiento");
        bai08.setDescripcionProceso("Administrar el capital intelectual de la organización para fomentar un entorno de aprendizaje continuo, asegurando que la información vital esté rigurosamente documentada, clasificada y disponible de manera inmediata para la toma de decisiones informada por parte de todas las gerencias operativas.");
        bai08.setPropositoProceso("Garantizar la protección de la inteligencia corporativa frente a la rotación de personal, asegurando que los manuales de resolución de problemas vehiculares y la arquitectura de los servidores centrales estén documentados de forma clara para facilitar el entrenamiento de los nuevos colaboradores y evitar interrupciones operativas.");

        bai08.setMetasAlineamiento("AG12: Personal competente, motivado y dotado de una comprensión compartida sobre la tecnología y el negocio.\nAG08: Habilitación y respaldo absoluto a los procesos comerciales mediante herramientas de información compartida.");
        bai08.setMetasEmpresariales("EG09: Personal corporativo con las habilidades idóneas y altamente capacitado.\nEG05: Cultura de innovación y mejora técnica continua.");
        bai08.setMetricasModelo("Métrica 1: Porcentaje de la documentación técnica y manuales operativos que han sido revisados y actualizados durante el último trimestre fiscal.\nMétrica 2: Tiempo promedio requerido para que un nuevo integrante del equipo técnico alcance el nivel de productividad esperado utilizando los repositorios institucionales de aprendizaje.");

        // ==========================================
        // COMPONENTE A: PRÁCTICAS Y ACTIVIDADES DE RETENCIÓN DE INFORMACIÓN
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(bai08);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("BAI08.01");
        pract01.setNombrePractica("Mantener y promover una cultura de intercambio de inteligencia");
        pract01.setDescripcionPractica("Fomentar un ambiente directivo donde compartir hallazgos técnicos sea recompensado, erradicando la costumbre de acaparar la información como mecanismo de poder interno.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Organizar foros institucionales mensuales donde los desarrolladores expertos expongan las soluciones más innovadoras aplicadas recientemente en el sistema operativo de los automóviles conectados."); a1_1.setNivelCapacidadEsperado(2); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Integrar la evaluación de las contribuciones a la base de conocimiento corporativa como un criterio obligatorio dentro de las revisiones de desempeño del personal técnico."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("BAI08.02");
        pract02.setNombrePractica("Identificar, clasificar y mantener la información crítica");
        pract02.setDescripcionPractica("Establecer un catálogo estructurado que distinga los documentos de valor estratégico para asegurar su actualización constante.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Crear diccionarios de datos centralizados que expliquen el significado exacto de cada variable telemétrica generada por los sensores del vehículo."); a2_1.setNivelCapacidadEsperado(3); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Asignar custodios documentales responsables de auditar trimestralmente la vigencia de los manuales de recuperación ante desastres informáticos."); a2_2.setNivelCapacidadEsperado(4); a2_2.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("BAI08.03");
        pract03.setNombrePractica("Garantizar la disponibilidad inmediata del conocimiento");
        pract03.setDescripcionPractica("Disponer los recursos informativos en plataformas de búsqueda veloz para que las gerencias operativas puedan acceder a soluciones comprobadas frente a incidentes recurrentes.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Implementar portales de consulta internos equipados con motores de búsqueda avanzada para los técnicos de los concesionarios automotrices."); a3_1.setNivelCapacidadEsperado(3); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Registrar formalmente las lecciones aprendidas al finalizar cada proyecto tecnológico importante para evitar la repetición de sobrecostos o errores de diseño arquitectónico."); a3_2.setNivelCapacidadEsperado(4); a3_2.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        bai08.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(bai08); raci1.setPracticaGestion("BAI08.01"); raci1.setRolOrganizacional("Director Ejecutivo de Recursos Humanos"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(bai08); raci2.setPracticaGestion("BAI08.02"); raci2.setRolOrganizacional("Gestor Principal del Conocimiento Corporativo"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(bai08); raci3.setPracticaGestion("BAI08.03"); raci3.setRolOrganizacional("Líderes de Operaciones y Servicios Comerciales"); raci3.setNivelResponsabilidad("C");

        bai08.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(bai08); flujo1.setPracticaGestion("BAI08.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: BAI05.06"); flujo1.setDescripcion("Informes formales sobre el nivel de adopción tecnológica institucional e identificación precisa de los vacíos de aprendizaje en el personal operativo.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(bai08); flujo2.setPracticaGestion("BAI08.03"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: DSS02.01"); flujo2.setDescripcion("Bases de datos de resolución de problemas documentadas y manuales estandarizados para acelerar la atención a las incidencias de los clientes.");

        bai08.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(bai08); hab1.setNombreHabilidad("Administración del Capital Intelectual y Curaduría de Contenidos Técnicos"); hab1.setDocumentacionRelacionada("Estándar Internacional de Sistemas de Gestión del Conocimiento avalado por la Organización Internacional de Normalización bajo el código 30401"); hab1.setReferenciaEspecifica("De esta normativa mundial se rescata de manera específica la metodología directiva para extraer el conocimiento tácito de los ingenieros expertos y transformarlo en manuales estructurados que pertenezcan legalmente a la organización.");

        bai08.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS INSTITUCIONALES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(bai08); pol1.setTituloPolitica("Directiva Estratégica de Retención de la Inteligencia Operativa"); pol1.setDescripcionPolitica("Regulación corporativa que prohíbe autorizar el finiquito laboral o la rotación hacia otros departamentos de cualquier colaborador clasificado como portador de conocimiento crítico sin que antes haya entregado un compendio documental validado que transfiera sus responsabilidades operativas al repositorio institucional."); pol1.setDocumentacionRelacionada("Estatuto Corporativo de Continuidad y Sucesión de Cargos"); pol1.setReferenciaEspecifica("Sección: Procedimientos Obligatorios para la Transición de Personal Clave");

        bai08.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE TRABAJO
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(bai08); cult1.setElementoCultural("Cultura de Documentación Colaborativa y Generosidad Intelectual"); cult1.setDocumentacionRelacionada("Principios Rectores del Desempeño Profesional"); cult1.setReferenciaEspecifica("Inculcar en todos los estratos de la empresa la convicción profunda de que el conocimiento no documentado es una debilidad institucional y promover una actitud de generosidad intelectual donde compartir la maestría técnica sea visto como la principal demostración de liderazgo.");

        bai08.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(bai08); serv1.setNombreServicioHerramienta("Plataformas Colaborativas de Documentación Enciclopédica Institucional y Repositorios Centralizados de Procedimientos");
        Servicio serv2 = new Servicio(); serv2.setProceso(bai08); serv2.setNombreServicioHerramienta("Sistemas de Gestión de Activos Digitales equipados con Control de Versiones Estricto");

        bai08.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(bai08);
    }
}