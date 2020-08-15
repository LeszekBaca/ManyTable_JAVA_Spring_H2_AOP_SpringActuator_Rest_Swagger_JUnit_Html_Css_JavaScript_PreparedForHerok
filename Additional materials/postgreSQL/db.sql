--
-- PostgreSQL database dump
--

-- Dumped from database version 12.3
-- Dumped by pg_dump version 12.3

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: adminpack; Type: EXTENSION; Schema: -; Owner: -
--

CREATE EXTENSION IF NOT EXISTS adminpack WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION adminpack; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION adminpack IS 'administrative functions for PostgreSQL';


SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: Car; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Car" (
    "Id" integer NOT NULL,
    "Mark" character varying NOT NULL,
    "Model" character varying NOT NULL,
    "Production_date_start" date,
    "Production_date_end" date
);


ALTER TABLE public."Car" OWNER TO postgres;

--
-- Name: Component; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Component" (
    "Id" integer NOT NULL,
    "Component_name" character varying NOT NULL,
    "Description_component" character varying NOT NULL,
    "Component_price" double precision NOT NULL,
    "Id_warehouse" integer NOT NULL,
    "Id_car" integer
);


ALTER TABLE public."Component" OWNER TO postgres;

--
-- Name: Product_feature; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Product_feature" (
    "Id" integer NOT NULL,
    "Product_feature" character varying NOT NULL,
    "Id_component" integer NOT NULL
);


ALTER TABLE public."Product_feature" OWNER TO postgres;

--
-- Name: Service_action; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Service_action" (
    "Id" integer NOT NULL,
    "Action_name" character varying NOT NULL,
    "Action_start_date" date NOT NULL,
    "Action_end_date" date,
    "Id_component" integer NOT NULL
);


ALTER TABLE public."Service_action" OWNER TO postgres;

--
-- Name: Warehouse; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Warehouse" (
    "Id" integer NOT NULL,
    "Component_availability" boolean NOT NULL,
    "Shipping_time" smallint NOT NULL
);


ALTER TABLE public."Warehouse" OWNER TO postgres;

--
-- Name: Warehouse_Shipping_time_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public."Warehouse_Shipping_time_seq"
    AS smallint
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public."Warehouse_Shipping_time_seq" OWNER TO postgres;

--
-- Name: Warehouse_Shipping_time_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public."Warehouse_Shipping_time_seq" OWNED BY public."Warehouse"."Shipping_time";


--
-- Name: Warehouse Shipping_time; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Warehouse" ALTER COLUMN "Shipping_time" SET DEFAULT nextval('public."Warehouse_Shipping_time_seq"'::regclass);


--
-- Name: Car Car_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Car"
    ADD CONSTRAINT "Car_pkey" PRIMARY KEY ("Id");


--
-- Name: Component Component_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Component"
    ADD CONSTRAINT "Component_pkey" PRIMARY KEY ("Id");


--
-- Name: Product_feature Product_feature_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Product_feature"
    ADD CONSTRAINT "Product_feature_pkey" PRIMARY KEY ("Id");


--
-- Name: Service_action Service_action_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Service_action"
    ADD CONSTRAINT "Service_action_pkey" PRIMARY KEY ("Id");


--
-- Name: Warehouse Warehouse_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Warehouse"
    ADD CONSTRAINT "Warehouse_pkey" PRIMARY KEY ("Id");


--
-- Name: Id_car; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX "Id_car" ON public."Car" USING btree ("Id");


--
-- Name: Id_component; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX "Id_component" ON public."Component" USING btree ("Id");


--
-- Name: Id_product_feature; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX "Id_product_feature" ON public."Product_feature" USING btree ("Id");


--
-- Name: Id_service_action; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX "Id_service_action" ON public."Service_action" USING btree ("Id");


--
-- Name: Id_warehouse; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX "Id_warehouse" ON public."Warehouse" USING btree ("Id");


--
-- Name: Component Id_car; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Component"
    ADD CONSTRAINT "Id_car" FOREIGN KEY ("Id_car") REFERENCES public."Car"("Id") NOT VALID;


--
-- Name: Product_feature Id_component; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Product_feature"
    ADD CONSTRAINT "Id_component" FOREIGN KEY ("Id_component") REFERENCES public."Component"("Id") NOT VALID;


--
-- Name: Service_action Id_component; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Service_action"
    ADD CONSTRAINT "Id_component" FOREIGN KEY ("Id_component") REFERENCES public."Component"("Id") NOT VALID;


--
-- Name: Component Id_warehouse; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Component"
    ADD CONSTRAINT "Id_warehouse" FOREIGN KEY ("Id_warehouse") REFERENCES public."Warehouse"("Id") NOT VALID;


--
-- PostgreSQL database dump complete
--

