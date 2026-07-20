package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(29)
public class Seeder_29_BAI10 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_29_BAI10(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("BAI10")) {
            cargarBAI10();
        }
    }

    private void cargarBAI10() {
        ProcesoCobit bai10 = new ProcesoCobit();
        bai10.setIdProceso("BAI10");
        bai10.setDominio("Construir, Adquirir e Implementar");
        bai10.setAreaPrioritaria("Modelo Core de COBIT");
        bai10.setNombreProceso("Gestionar la configuración");
        bai10.setDescripcionProceso("Definir y mantener descripciones y relaciones entre los recursos y capacidades clave requeridos para la provisión de servicios habilitados por I&T. Esto incluye la recopilación de información de configuración, el establecimiento de líneas base, y la verificación y auditoría de la información de configuración.");
        bai10.setPropositoProceso("Garantizar que la organización posea un mapa detallado y actualizado de todas las conexiones entre los servidores corporativos y los sistemas a bordo de los vehículos, posibilitando predecir el impacto exacto de cualquier falla técnica y acelerar la recuperación de los servicios ante caídas imprevistas.");

        bai10.setMetasAlineamiento("AG07: Seguridad de la información, infraestructura de procesamiento y de las aplicaciones.\nAG08: Habilitación y soporte de procesos de negocio mediante la integración de aplicaciones y tecnología.");
        bai10.setMetasEmpresariales("EG06: Continuidad y disponibilidad del servicio de negocio.\nEG01: Portafolio de productos y servicios competitivos.");
        bai10.setMetricasModelo("Métrica 1: Número de desviaciones identificadas entre el registro de configuración y la configuración física real.\nMétrica 2: Porcentaje de cambios en la configuración completados exitosamente sin impacto adverso imprevisto.");

        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(bai10);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("BAI10.01");
        pract01.setNombrePractica("Establecer y mantener un modelo lógico de configuración");
        pract01.setDescripcionPractica("Establecer un modelo lógico de configuración (Base de Datos de Gestión de la Configuración - CMDB) que registre los componentes del servicio, su infraestructura e interrelaciones (Elementos de Configuración - CI).");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Definir los requerimientos de información de gestión de configuración y el nivel de detalle necesario para la toma de decisiones."); a1_1.setNivelCapacidadEsperado(2); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Definir e implementar el modelo lógico que sirva como base para la CMDB."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        Actividad a1_3 = new Actividad(); a1_3.setPractica(pract01); a1_3.setDescripcionActividad("Establecer los procedimientos y mecanismos para mantener la CMDB sincronizada con los cambios operativos reales."); a1_3.setNivelCapacidadEsperado(3); a1_3.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2, a1_3));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("BAI10.02");
        pract02.setNombrePractica("Establecer y mantener una línea base de configuración");
        pract02.setDescripcionPractica("Registrar formalmente el estado de configuración de los sistemas y servicios de I&T para establecer una línea base de control sólida.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Identificar y registrar todos los elementos de configuración de I&T que deban controlarse."); a2_1.setNivelCapacidadEsperado(2); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Aprobar formalmente el estado documentado como línea base autorizada para futuras comparaciones."); a2_2.setNivelCapacidadEsperado(3); a2_2.setCalificacionActual("N");
        Actividad a2_3 = new Actividad(); a2_3.setPractica(pract02); a2_3.setDescripcionActividad("Asegurar que todas las actualizaciones de la CMDB reflejen estrictamente cambios debidamente autorizados e implementados."); a2_3.setNivelCapacidadEsperado(4); a2_3.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2, a2_3));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("BAI10.05");
        pract03.setNombrePractica("Verificar y auditar la información de configuración");
        pract03.setDescripcionPractica("Realizar auditorías periódicas a la CMDB para verificar la integridad de la información y confirmar la alineación de la línea base con el entorno de producción real.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Efectuar comprobaciones físicas y lógicas periódicas de los elementos de configuración frente a los registros de la CMDB."); a3_1.setNivelCapacidadEsperado(3); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Identificar, informar y corregir cualquier discrepancia o software/hardware no autorizado."); a3_2.setNivelCapacidadEsperado(4); a3_2.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        bai10.setComponenteA_Procesos(Arrays.asList(compA));

        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(bai10); raci1.setPracticaGestion("BAI10.01"); raci1.setRolOrganizacional("Arquitecto Principal de Infraestructura"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(bai10); raci2.setPracticaGestion("BAI10.02"); raci2.setRolOrganizacional("Gestor General de Configuraciones"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(bai10); raci3.setPracticaGestion("BAI10.05"); raci3.setRolOrganizacional("Dirección de Auditoría Técnica y Cumplimiento"); raci3.setNivelResponsabilidad("C");
        bai10.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(bai10); flujo1.setPracticaGestion("BAI10.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: BAI06.03"); flujo1.setDescripcion("Registros históricos y notificaciones de todos los cambios de infraestructura debidamente aprobados e implementados.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(bai10); flujo2.setPracticaGestion("BAI10.05"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: DSS02.02"); flujo2.setDescripcion("Base de datos de relaciones sistémicas validada para asistir a los analistas de soporte técnico durante la resolución veloz de incidentes.");
        bai10.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        Habilidad hab1 = new Habilidad(); hab1.setProceso(bai10); hab1.setNombreHabilidad("Diseño y Gestión de Topologías de Red e Interdependencias Sistémicas"); hab1.setDocumentacionRelacionada("Biblioteca de Infraestructura de Tecnologías de la Información enfocada en la Gestión del Ciclo de Vida del Servicio"); hab1.setReferenciaEspecifica("De este estándar operativo se rescatan las pautas concretas para definir cuáles son los atributos mínimos que deben documentarse por cada servidor o componente lógico, permitiendo establecer relaciones causa y efecto sumamente precisas sin saturar la capacidad de análisis gerencial.");
        bai10.setComponenteD_Habilidades(Arrays.asList(hab1));

        Politica pol1 = new Politica(); pol1.setProceso(bai10); pol1.setTituloPolitica("Directiva de Trazabilidad y Precisión Estructural Corporativa"); pol1.setDescripcionPolitica("Normativa rigurosa que exige que cualquier componente tecnológico que no se encuentre debidamente registrado en el mapa lógico corporativo sea considerado inmediatamente como una amenaza de seguridad, otorgando autoridad plena a los administradores de red para desconectarlo sin requerir consulta previa."); pol1.setDocumentacionRelacionada("Reglamento de Ciberseguridad y Arquitectura Institucional"); pol1.setReferenciaEspecifica("Sección: Control de Dispositivos No Identificados y Defensa Perimetral");
        bai10.setComponenteE_Politicas(Arrays.asList(pol1));

        Cultura cult1 = new Cultura(); cult1.setProceso(bai10); cult1.setElementoCultural("Cultura de Visibilidad Integral y Respeto a la Arquitectura"); cult1.setDocumentacionRelacionada("Código de Excelencia Operativa"); cult1.setReferenciaEspecifica("Fomentar en todos los especialistas informáticos la comprensión de que operar a ciegas o modificar sistemas ocultando el rastro estructural constituye un acto de negligencia corporativa, promoviendo en su lugar una mentalidad donde la claridad documental sea tan valorada como la destreza en la programación.");
        bai10.setComponenteF_Cultura(Arrays.asList(cult1));

        Servicio serv1 = new Servicio(); serv1.setProceso(bai10); serv1.setNombreServicioHerramienta("Bases de Datos de Gestión de la Configuración Integradas y Automatizadas");
        Servicio serv2 = new Servicio(); serv2.setProceso(bai10); serv2.setNombreServicioHerramienta("Plataformas Digitales de Trazabilidad Cartográfica y Descubrimiento Topológico de Redes Informáticas");
        bai10.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(bai10);
    }
}