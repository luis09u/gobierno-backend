package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(29) // Secuencia de construcción estructural en el dominio BAI
public class Seeder_29_BAI10 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_29_BAI10(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("BAI10")) {
            System.out.println("Iniciando carga de datos de gestión de la configuración: BAI10...");
            cargarBAI10();
            System.out.println("BAI10 (Gestión de la Configuración) cargado exitosamente.");
        }
    }

    private void cargarBAI10() {
        // ==========================================
        // INFORMACIÓN GENERAL (ENFOQUE DE VISIBILIDAD Y CONTROL ESTRUCTURAL)
        // ==========================================
        ProcesoCobit bai10 = new ProcesoCobit();
        bai10.setIdProceso("BAI10");
        bai10.setDominio("Construir, Adquirir e Implementar");
        bai10.setAreaPrioritaria("Modelo Core de COBIT");
        bai10.setNombreProceso("Gestionar la configuración");
        bai10.setDescripcionProceso("Crear y mantener un modelo lógico exhaustivo que documente todos los componentes tecnológicos de la organización y sus complejas interrelaciones, permitiendo a la alta dirección visualizar exactamente cómo la infraestructura de red respalda los servicios comerciales entregados al cliente.");
        bai10.setPropositoProceso("Garantizar que la organización posea un mapa detallado y actualizado de todas las conexiones entre los servidores corporativos y los sistemas a bordo de los vehículos, posibilitando predecir el impacto exacto de cualquier falla técnica y acelerar la recuperación de los servicios ante caídas imprevistas.");

        bai10.setMetasAlineamiento("AG07: Seguridad, confiabilidad e integridad permanente de los medios de procesamiento de datos institucionales.\nAG08: Habilitación operativa y soporte ininterrumpido a los procesos comerciales mediante tecnología predictiva.");
        bai10.setMetasEmpresariales("EG06: Continuidad operativa y disponibilidad permanente de los servicios frente al consumidor final.\nEG01: Portafolio de productos comerciales competitivos dotados de alta fiabilidad estructural.");
        bai10.setMetricasModelo("Métrica 1: Nivel de coincidencia exacta entre la realidad física de los centros de datos y los registros documentados en el mapa lógico corporativo durante las auditorías sorpresa.\nMétrica 2: Redución del tiempo empleado por los equipos de soporte para identificar el origen de un problema sistémico gracias al uso del mapa de relaciones tecnológicas.");

        // ==========================================
        // COMPONENTE A: PRÁCTICAS Y ACTIVIDADES DE MAPEO SISTÉMICO
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(bai10);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("BAI10.01");
        pract01.setNombrePractica("Establecer el modelo base de configuración corporativa");
        pract01.setDescripcionPractica("Definir la estructura del repositorio centralizado que almacenará la información sobre cómo los equipos físicos, los programas y las redes de telecomunicaciones interactúan entre sí.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Desarrollar una base de datos de gestión de la configuración que clasifique a cada vehículo conectado y a cada servidor corporativo como elementos individuales interdependientes."); a1_1.setNivelCapacidadEsperado(3); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Determinar el nivel de detalle requerido para el registro de los elementos, evitando documentar componentes irrelevantes que saturen la base de datos y dificulten el análisis gerencial."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("BAI10.02");
        pract02.setNombrePractica("Mantener actualizada la topología de la información");
        pract02.setDescripcionPractica("Asegurar que cualquier modificación realizada en el entorno físico o virtual se refleje de forma inmediata en el mapa lógico de la empresa.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Vincular los sistemas de automatización de código con el mapa de configuración para que el registro se actualice por sí solo cada vez que los ingenieros desplieguen una nueva versión de los sistemas automotrices."); a2_1.setNivelCapacidadEsperado(4); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Bloquear administrativamente el cierre de cualquier tarea de mantenimiento técnico hasta que el especialista responsable confirme haber actualizado las relaciones de red en el sistema central."); a2_2.setNivelCapacidadEsperado(4); a2_2.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("BAI10.03");
        pract03.setNombrePractica("Verificar y auditar la integridad del modelo");
        pract03.setDescripcionPractica("Corroborar periódicamente que el dibujo conceptual de la red institucional coincida milimétricamente con las conexiones físicas y virtuales existentes.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Ejecutar rutinas de rastreo digital semanales que recorran toda la infraestructura de la nube para identificar conexiones no autorizadas o discrepancias con el inventario lógico."); a3_1.setNivelCapacidadEsperado(4); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Penalizar disciplinariamente a los equipos de ingeniería que alteren la infraestructura sin notificar al sistema de configuración, protegiendo así la confiabilidad del mapa corporativo."); a3_2.setNivelCapacidadEsperado(3); a3_2.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        bai10.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(bai10); raci1.setPracticaGestion("BAI10.01"); raci1.setRolOrganizacional("Arquitecto Principal de Infraestructura"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(bai10); raci2.setPracticaGestion("BAI10.02"); raci2.setRolOrganizacional("Gestor General de Configuraciones"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(bai10); raci3.setPracticaGestion("BAI10.03"); raci3.setRolOrganizacional("Dirección de Auditoría Técnica y Cumplimiento"); raci3.setNivelResponsabilidad("C");

        bai10.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(bai10); flujo1.setPracticaGestion("BAI10.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: BAI06.03"); flujo1.setDescripcion("Registros históricos y notificaciones de todos los cambios de infraestructura debidamente aprobados e implementados.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(bai10); flujo2.setPracticaGestion("BAI10.03"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: DSS02.02"); flujo2.setDescripcion("Base de datos de relaciones sistémicas validada para asistir a los analistas de soporte técnico durante la resolución veloz de incidentes.");

        bai10.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(bai10); hab1.setNombreHabilidad("Diseño y Gestión de Topologías de Red e Interdependencias Sistémicas"); hab1.setDocumentacionRelacionada("Biblioteca de Infraestructura de Tecnologías de la Información enfocada en la Gestión del Ciclo de Vida del Servicio"); hab1.setReferenciaEspecifica("De este estándar operativo se rescatan las pautas concretas para definir cuáles son los atributos mínimos que deben documentarse por cada servidor o componente lógico, permitiendo establecer relaciones causa y efecto sumamente precisas sin saturar la capacidad de análisis gerencial.");

        bai10.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS INSTITUCIONALES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(bai10); pol1.setTituloPolitica("Directiva de Trazabilidad y Precisión Estructural Corporativa"); pol1.setDescripcionPolitica("Normativa rigurosa que exige que cualquier componente tecnológico que no se encuentre debidamente registrado en el mapa lógico corporativo sea considerado inmediatamente como una amenaza de seguridad, otorgando autoridad plena a los administradores de red para desconectarlo sin requerir consulta previa."); pol1.setDocumentacionRelacionada("Reglamento de Ciberseguridad y Arquitectura Institucional"); pol1.setReferenciaEspecifica("Sección: Control de Dispositivos No Identificados y Defensa Perimetral");

        bai10.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE TRABAJO
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(bai10); cult1.setElementoCultural("Cultura de Visibilidad Integral y Respeto a la Arquitectura"); cult1.setDocumentacionRelacionada("Código de Excelencia Operativa"); cult1.setReferenciaEspecifica("Fomentar en todos los especialistas informáticos la comprensión de que operar a ciegas o modificar sistemas ocultando el rastro estructural constituye un acto de negligencia corporativa, promoviendo en su lugar una mentalidad donde la claridad documental sea tan valorada como la destreza en la programación.");

        bai10.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(bai10); serv1.setNombreServicioHerramienta("Bases de Datos de Gestión de la Configuración Integradas y Automatizadas");
        Servicio serv2 = new Servicio(); serv2.setProceso(bai10); serv2.setNombreServicioHerramienta("Plataformas Digitales de Trazabilidad Cartográfica y Descubrimiento Topológico de Redes Informáticas");

        bai10.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(bai10);
    }
}