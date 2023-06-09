toc.dat                                                                                             0000600 0004000 0002000 00000016330 14452006424 0014443 0                                                                                                    ustar 00postgres                        postgres                        0000000 0000000                                                                                                                                                                        PGDMP                           {         	   companydb    15.3    15.3                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                    0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                    0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                    1262    24586 	   companydb    DATABASE     �   CREATE DATABASE companydb WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'English_United States.1252';
    DROP DATABASE companydb;
                postgres    false         �            1259    24588 	   customers    TABLE     �   CREATE TABLE public.customers (
    customer_id integer NOT NULL,
    first_name character varying(50),
    last_name character varying(75),
    phone character varying(30),
    country character varying(40),
    age integer DEFAULT 0
);
    DROP TABLE public.customers;
       public         heap    postgres    false         �            1259    24587    customers_customer_id_seq    SEQUENCE     �   CREATE SEQUENCE public.customers_customer_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 0   DROP SEQUENCE public.customers_customer_id_seq;
       public          postgres    false    215                    0    0    customers_customer_id_seq    SEQUENCE OWNED BY     W   ALTER SEQUENCE public.customers_customer_id_seq OWNED BY public.customers.customer_id;
          public          postgres    false    214         �            1259    32789    orders    TABLE     �   CREATE TABLE public.orders (
    order_id bigint NOT NULL,
    item character varying(100),
    amount integer,
    customer_id integer
);
    DROP TABLE public.orders;
       public         heap    postgres    false         �            1259    32788    order_id_seq    SEQUENCE     u   CREATE SEQUENCE public.order_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 #   DROP SEQUENCE public.order_id_seq;
       public          postgres    false    217                    0    0    order_id_seq    SEQUENCE OWNED BY     D   ALTER SEQUENCE public.order_id_seq OWNED BY public.orders.order_id;
          public          postgres    false    216         �            1259    32796 	   shippings    TABLE     ~   CREATE TABLE public.shippings (
    shipping_id bigint NOT NULL,
    status character varying(20),
    customer_id integer
);
    DROP TABLE public.shippings;
       public         heap    postgres    false         �            1259    32795 
   shp_id_seq    SEQUENCE     s   CREATE SEQUENCE public.shp_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 !   DROP SEQUENCE public.shp_id_seq;
       public          postgres    false    219                    0    0 
   shp_id_seq    SEQUENCE OWNED BY     H   ALTER SEQUENCE public.shp_id_seq OWNED BY public.shippings.shipping_id;
          public          postgres    false    218         o           2604    24591    customers customer_id    DEFAULT     ~   ALTER TABLE ONLY public.customers ALTER COLUMN customer_id SET DEFAULT nextval('public.customers_customer_id_seq'::regclass);
 D   ALTER TABLE public.customers ALTER COLUMN customer_id DROP DEFAULT;
       public          postgres    false    214    215    215         q           2604    32792    orders order_id    DEFAULT     k   ALTER TABLE ONLY public.orders ALTER COLUMN order_id SET DEFAULT nextval('public.order_id_seq'::regclass);
 >   ALTER TABLE public.orders ALTER COLUMN order_id DROP DEFAULT;
       public          postgres    false    216    217    217         r           2604    32799    shippings shipping_id    DEFAULT     o   ALTER TABLE ONLY public.shippings ALTER COLUMN shipping_id SET DEFAULT nextval('public.shp_id_seq'::regclass);
 D   ALTER TABLE public.shippings ALTER COLUMN shipping_id DROP DEFAULT;
       public          postgres    false    219    218    219         
          0    24588 	   customers 
   TABLE DATA           \   COPY public.customers (customer_id, first_name, last_name, phone, country, age) FROM stdin;
    public          postgres    false    215       3338.dat           0    32789    orders 
   TABLE DATA           E   COPY public.orders (order_id, item, amount, customer_id) FROM stdin;
    public          postgres    false    217       3340.dat           0    32796 	   shippings 
   TABLE DATA           E   COPY public.shippings (shipping_id, status, customer_id) FROM stdin;
    public          postgres    false    219       3342.dat            0    0    customers_customer_id_seq    SEQUENCE SET     J   SELECT pg_catalog.setval('public.customers_customer_id_seq', 1029, true);
          public          postgres    false    214                    0    0    order_id_seq    SEQUENCE SET     :   SELECT pg_catalog.setval('public.order_id_seq', 7, true);
          public          postgres    false    216                    0    0 
   shp_id_seq    SEQUENCE SET     8   SELECT pg_catalog.setval('public.shp_id_seq', 5, true);
          public          postgres    false    218         t           2606    24593    customers customers_pkey 
   CONSTRAINT     _   ALTER TABLE ONLY public.customers
    ADD CONSTRAINT customers_pkey PRIMARY KEY (customer_id);
 B   ALTER TABLE ONLY public.customers DROP CONSTRAINT customers_pkey;
       public            postgres    false    215         v           2606    32794    orders order_pkey 
   CONSTRAINT     U   ALTER TABLE ONLY public.orders
    ADD CONSTRAINT order_pkey PRIMARY KEY (order_id);
 ;   ALTER TABLE ONLY public.orders DROP CONSTRAINT order_pkey;
       public            postgres    false    217         x           2606    32803    shippings shipping_pkey 
   CONSTRAINT     ^   ALTER TABLE ONLY public.shippings
    ADD CONSTRAINT shipping_pkey PRIMARY KEY (shipping_id);
 A   ALTER TABLE ONLY public.shippings DROP CONSTRAINT shipping_pkey;
       public            postgres    false    219         y           2606    40996    orders customer_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.orders
    ADD CONSTRAINT customer_fkey FOREIGN KEY (customer_id) REFERENCES public.customers(customer_id) NOT VALID;
 >   ALTER TABLE ONLY public.orders DROP CONSTRAINT customer_fkey;
       public          postgres    false    217    215    3188         z           2606    41001    shippings customer_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.shippings
    ADD CONSTRAINT customer_fkey FOREIGN KEY (customer_id) REFERENCES public.customers(customer_id) NOT VALID;
 A   ALTER TABLE ONLY public.shippings DROP CONSTRAINT customer_fkey;
       public          postgres    false    3188    219    215                                                                                                                                                                                                                                                                                                                3338.dat                                                                                            0000600 0004000 0002000 00000113606 14452006424 0014262 0                                                                                                    ustar 00postgres                        postgres                        0000000 0000000                                                                                                                                                                        5	Abdullah	Aktaş	111	TR	22
2	Burak	Delice	7896	NL	22
15	Ali	Güneş	879879	CA	22
4	Ahmet	Akkoyun	4423	DE	35
8	Engin	Ertikmen	333	RU	26
9	Yiğitcan	Abay	5553	USA	24
14	Serkan Şahin	Zorlu	8979	DE	31
3	Ünal Gani	Berk	22	USA	24
10	Aysu	Çağışlar	32324	UK	25
12	Osman Onur	Baş	555	BR	19
7	Gizem	Kuşçuoğlu	122131	CA	21
13	Orhun	Bayındır	87789	TR	27
11	Salih Polat	Dönmez	678686	USA	28
6	Mehmet Caner	Öksüz	5657	DE	28
1	Aminenur	Göynük	222	UK	33
19	DDD	BBB	111	PL	23
21	AAA	BBB	111	PL	25
28	EEE	BBB	111	PL	25
18	CCC	BBB	111	DE	24
26	CCC	BBB	111	TR	32
20	EEE	BBB	111	CA	22
25	AAA	BBB	111	UA	25
27	DDD	BBB	111	UA	52
23	DDD	BBB	111	TR	52
24	EEE	BBB	111	BR	25
22	CCC	BBB	111	RU	32
29	Earlie	Culley	656-840-8220	PT	57
30	Blinny	Jaray	802-672-0124	UA	57
31	Fletch	Godbald	481-728-9190	UA	80
32	Karlens	Kelcey	834-668-5525	PF	60
33	Paxton	Van Salzberger	859-650-3021	FR	65
34	Bethena	Lunbech	940-878-8533	PH	53
35	Pincas	Chidley	709-855-3093	CN	29
36	Royall	Halfhead	230-201-1336	DE	69
37	Sadie	Benck	263-418-2562	CN	33
38	Fayth	McBryde	574-200-9079	PH	69
39	Dania	Whytock	871-431-2998	CD	53
40	Corabel	MacDonogh	417-315-0996	MG	74
41	Ronny	Shafier	591-812-2890	VN	45
42	Gerome	Paradis	527-528-0125	PL	78
43	Cull	Seary	145-826-2960	TH	27
44	Madelon	Twiddle	616-445-0366	PT	68
45	Natale	Cliburn	227-285-4236	CN	52
46	Georgeanna	Jefferson	587-853-4833	CN	57
47	Aggie	Blundin	136-813-9912	CA	60
48	Vladamir	Brightling	309-563-3790	SY	52
49	Gabriello	Jimenez	972-123-7366	MX	41
50	Norby	Braley	603-153-9923	CN	75
51	Thain	Ravilious	888-298-0985	BR	73
52	Isabella	Grellis	860-227-8023	RU	48
53	Lorinda	Francescozzi	972-341-5384	LT	72
54	Cherish	Height	756-875-1348	CN	30
55	Berenice	Tomkowicz	474-786-4727	BJ	68
56	Olly	Becraft	530-834-4743	BD	65
57	Flinn	Baildon	986-982-1828	CN	25
58	Julita	Edmonston	971-314-3359	CI	50
59	Tyne	Harling	530-281-3015	FR	26
60	Biddie	Maudlin	578-894-2132	CN	30
61	Ario	Lumb	652-164-0086	CO	50
62	Rooney	Soden	101-651-4567	RU	68
63	Boris	Levett	180-595-3442	ID	27
64	Tynan	Wivell	680-918-0521	BR	18
65	Kati	Freund	794-898-6541	EG	50
66	Ertha	Ruffy	647-648-0669	PL	75
67	Cate	Habishaw	612-659-1960	CN	33
68	Baldwin	Woolliams	585-133-9044	CA	54
69	Sloane	Blythin	425-338-0936	CN	64
70	Ermanno	Kopman	701-153-2538	CN	75
71	Ashlan	Gouldthorp	584-846-0927	CN	79
72	Korrie	Hallford	110-849-2992	RU	25
73	Parnell	Raoul	139-696-6904	MY	54
74	Annora	Labrum	112-748-0470	PL	52
75	Flint	Heaney`	263-250-8113	BW	22
76	Brander	Scryne	350-346-6612	TH	67
77	Stephani	Grayson	909-803-1742	RU	59
78	Normie	McLucky	842-950-1463	PT	78
79	Janela	Ferri	544-246-6918	RU	67
80	Greggory	Scrinage	938-513-6075	ID	76
81	Giovanni	Cicchillo	223-552-5511	CN	69
82	Georgette	Matthisson	442-764-0757	UA	47
83	Morley	Rubberts	670-777-4946	ID	29
84	Ailina	Stichel	787-102-0670	ID	38
85	Zora	Segeswoeth	524-372-3880	CN	67
86	Sylas	O' Donohoe	832-474-4967	JP	71
87	Izzy	Jennaway	773-344-9249	CH	52
88	Benjie	Stockney	847-506-6472	ID	71
89	Flss	Huttley	562-483-3011	CN	57
90	Urson	Puttergill	501-537-2669	ZM	55
91	Elsi	Ofener	217-728-0771	GH	59
92	Burtie	Seivertsen	809-308-1780	YE	47
93	Kerry	Stook	236-888-1853	BR	35
94	Friedrich	Supple	679-498-6286	GR	25
95	Adorne	Etherington	667-179-4713	FR	48
96	Ethyl	Bischof	621-566-1159	PT	59
97	Dionisio	Heckle	400-553-2077	CN	51
98	Arlena	Burnip	775-810-6420	ID	48
99	Edna	Edelston	520-270-9686	CZ	78
100	Evered	Dudin	232-276-8433	MX	42
101	Cherey	Farr	492-273-2300	ID	36
102	Val	Hinkensen	915-582-9779	FR	68
103	Stoddard	Merrick	963-573-9049	PL	21
104	Jesse	Briscam	397-323-8951	BW	33
105	Ray	Janusik	102-670-0093	CZ	60
106	Marie-jeanne	Longmore	758-787-7997	JP	71
107	Calypso	Barszczewski	669-145-2236	CA	70
108	Caprice	Sharvell	196-227-1161	TH	22
109	Milena	Blissitt	927-195-5022	CA	43
110	Tammie	Elan	476-513-1870	MG	55
111	Cris	Baress	734-310-1446	IE	39
112	Nessa	Snailham	717-477-6467	AR	79
113	Lana	Beloe	762-831-9076	PT	76
114	Lauree	Shute	509-415-5985	FR	18
115	Haily	Twatt	668-252-3970	CO	69
116	Georg	Vedyaev	804-421-7669	CZ	50
117	Rochette	Downie	177-302-7506	MY	77
118	Sarine	Gilluley	102-562-6791	RU	62
119	Hammad	Adlam	755-112-6727	CN	54
120	Arlette	Backe	110-429-7785	RS	32
121	Thaddeus	Petchell	999-252-0951	PT	53
122	Aeriell	Dory	448-970-5922	BY	22
123	Tobe	Vonderdell	720-908-0019	US	70
124	Andris	Phillpotts	231-430-4100	LY	51
125	Roselin	Torresi	993-537-1953	SE	67
126	Maryann	Snow	686-252-5871	CN	43
127	Hanan	Haylett	844-554-6089	UA	36
128	Gilburt	Duns	674-477-4262	NP	68
129	Brandea	Daintrey	850-867-0952	US	42
130	Ogdan	Deinert	216-115-2978	PH	31
131	Horace	Ainslie	504-242-9211	PG	53
132	Karyn	Vaszoly	320-419-1617	SE	21
133	Viola	Moffet	553-219-8799	VE	76
134	Bernadette	Faustian	906-496-7062	CN	69
135	Michale	Scading	483-533-8228	MN	30
136	Robbi	Ainger	474-277-1693	AL	29
137	Danice	Pettett	938-488-2900	CN	53
138	Ambros	Short	330-302-5625	ID	33
139	Tripp	Combes	776-187-7778	LT	20
140	Lira	Ruck	218-969-9960	ZA	23
141	Melita	Knibley	476-499-2500	FR	27
142	Noble	D'Angeli	517-261-5816	GE	44
143	Sig	Boow	940-172-0232	IQ	45
144	Clevey	Treversh	862-401-7286	SV	67
145	Guthrie	Arnecke	912-495-3131	CN	24
146	Wynny	Ingree	467-802-9629	CN	43
147	Derk	Baser	806-115-7495	FR	55
148	Casandra	Matissoff	618-512-3524	AM	76
149	Giulio	Cutajar	632-337-6332	PL	77
150	Zared	Christofor	678-970-2167	FR	50
151	Jesse	Odgers	436-955-5666	CN	31
152	Caddric	Swyndley	658-403-1552	YE	60
153	Kerrin	Soro	405-802-3399	GQ	44
154	Walliw	Alessandrucci	891-212-3467	RU	57
155	Willdon	Kupka	678-341-6211	MX	67
156	Jobi	Rosengren	226-948-3355	ID	42
157	Nolie	Balaisot	998-808-9696	NG	21
158	Kelly	Handford	867-425-1842	CN	71
159	Drona	Figgins	692-692-0694	PH	36
160	Thurston	Mercer	335-393-8384	CN	36
161	Janelle	Gimbart	132-371-8168	AL	47
162	Luci	Monument	666-572-5240	ID	77
163	Hamish	Billany	541-627-0949	AF	63
164	Benedick	Compston	706-463-9921	US	80
165	Werner	Endean	693-545-9458	PS	77
166	Tess	Huffy	657-708-0290	CO	50
167	Lonna	Antonchik	202-431-2187	US	42
168	Emmott	Balnaves	761-965-6608	PT	38
169	Kellen	Briiginshaw	856-951-6716	PH	68
170	Tedi	Hartegan	368-106-3125	RS	66
171	Haily	Whittington	263-349-5423	PH	59
172	Galvin	MacCostye	560-233-7458	CN	70
173	Fallon	Whyborn	978-865-5445	MA	43
174	Kania	Twyning	163-462-2108	PT	52
175	Suellen	Willcox	405-471-9602	LK	56
176	Brocky	Borgesio	620-727-1504	UA	64
177	Myles	Simeonov	472-748-2285	CN	75
178	Celestine	Gallgher	112-811-7724	KR	23
179	Leticia	Undrill	359-293-0643	SE	27
180	Branden	Langer	815-932-6799	CN	67
181	Pail	Connors	733-315-4382	AF	35
182	Linnell	Folks	140-397-9689	CN	53
183	Torrie	Veitch	545-320-1606	KG	79
184	Iorgos	McLeod	708-280-0485	NL	36
185	Maiga	Martinat	354-326-6168	MV	20
186	Salomi	Rosling	719-313-8085	FR	79
187	Noelle	Klaes	791-131-0615	PT	34
188	Hamilton	Hoopper	231-232-4987	BR	59
189	Darleen	Conibeer	130-145-1700	BD	40
190	Tani	Marley	496-910-9114	PH	19
191	Hermy	Mulkerrins	128-648-9445	BA	68
192	Henrik	Lesper	385-500-9311	SI	18
193	Simone	Coughlin	779-536-3749	ID	43
194	Jessi	Fontanet	417-348-8823	CN	69
195	Ricardo	Hotton	441-162-5101	PE	59
196	Fanechka	Gorke	482-628-7408	PL	72
197	Mellisa	Bayles	707-749-4356	PL	37
198	Jonie	Birdseye	340-521-0916	KG	68
199	Windham	Dando	698-473-7975	BG	30
200	Albertina	Spillane	799-851-1440	PE	43
201	Nate	Merrall	540-233-4374	US	57
202	Cthrine	Phillipp	288-578-7245	CL	74
203	Doralin	Heighton	696-545-9599	ID	60
204	Ranna	Hairyes	382-147-0460	HR	49
205	Gweneth	Orable	727-793-4215	TH	55
206	Anica	Caines	405-944-1054	US	34
207	Beatrisa	Sunnex	644-775-4501	PT	49
208	Reina	Estoile	142-438-4200	JP	51
209	Florrie	Fasey	395-298-2635	MK	54
210	Zsa zsa	Bedlington	212-671-4677	US	36
211	Byrle	Ghidoni	211-999-6389	MG	64
212	Claribel	Scurry	527-159-4894	CN	67
213	Kayle	Dobson	209-963-3948	CN	59
214	Lauretta	Sleney	488-754-1455	ID	55
215	Laurena	Arunowicz	359-221-1696	RU	45
216	Ker	Martinelli	755-219-8997	RU	79
217	Jenni	Rosenbloom	471-708-3633	RU	46
218	Dosi	Skullet	572-873-7718	PL	18
219	Silva	Cumberland	875-177-5306	ID	19
220	Timmy	Urpeth	676-678-5545	ID	26
221	Matias	Huitt	447-619-8517	PL	32
222	Fania	Healks	750-681-7293	PH	58
223	Danielle	Le Guin	233-972-1136	CZ	51
224	Trstram	McLanaghan	844-728-5518	RS	76
225	Huntley	Banbrick	494-377-5678	ID	64
226	Augusta	Rillett	626-636-4236	MG	46
227	Nils	Knaggs	997-782-2968	TH	36
228	Mahmud	Teulier	468-958-0069	CN	74
229	Richy	Bambrick	951-528-5949	PK	38
230	Englebert	Purkess	164-777-9218	MT	80
231	Alasteir	Milton	530-580-9506	CN	47
232	Beulah	Colbron	815-520-7367	JP	62
233	Bella	O'Kane	449-875-4140	FR	51
234	Vernice	Constantine	552-566-7624	NL	49
235	Kenn	Fortun	991-608-7818	IR	25
236	Christal	Treneer	904-618-1884	US	46
237	Logan	Stanyan	334-898-9713	CN	63
238	Gerri	Squibe	186-455-4597	CA	58
239	Nannette	Westmerland	725-576-0335	SE	26
240	Justis	Gallen	612-384-7304	CZ	71
241	Elayne	Britian	765-676-5205	SE	52
242	Frasco	Silbersak	421-129-2457	CO	42
243	Maryann	Snipe	759-448-9719	FR	55
244	Eddie	Coates	843-122-6655	US	32
245	Philip	Frackiewicz	311-653-8454	NE	27
246	Aeriel	Ackermann	604-840-8718	CN	41
247	Daisie	Swate	757-758-5126	CN	23
248	Eadmund	Easlea	859-933-1370	PT	39
249	Britt	Pattisson	102-920-0292	AR	32
250	Torre	Loosley	842-167-5523	PH	72
251	Peria	McCrory	870-544-7638	CA	60
252	Jewelle	Jenks	832-351-5480	US	49
253	Alix	Smetoun	690-367-7139	ID	21
254	Allyce	Klimentyev	219-421-5765	FI	24
255	Garner	Hubbard	804-144-6923	SE	25
256	Rosemary	Sidary	861-518-6001	CN	70
257	Joyous	Smorthwaite	108-723-1530	NO	27
258	Stearn	Gellier	494-187-7169	PH	42
259	Kalli	Bartosiak	785-840-4856	US	76
260	Consolata	Poxton	733-959-6312	CN	67
261	Jessamyn	Wimmer	534-357-6660	CN	25
262	Carolynn	Balkwill	102-539-9042	JO	52
263	Masha	Ambrogiotti	153-711-7857	PE	79
264	Simon	Geraldini	867-476-1754	CN	64
265	Caryl	Skain	347-219-2238	SE	57
266	Izabel	McArthur	411-202-0652	PL	35
267	Roger	Saich	314-527-8574	CN	23
268	Farica	Storer	335-701-1746	PE	72
269	Kayla	Chafney	498-103-4509	KZ	80
270	Harwilll	Giacoboni	790-469-8363	CA	40
271	Nealson	Grassi	114-170-6980	FR	80
272	Ardenia	Melendez	986-150-4553	ID	52
273	Balduin	Kernermann	178-556-4525	ID	79
274	Siffre	Benwell	794-692-6536	DO	47
275	Anselma	Keyson	999-346-7677	BR	51
276	Herve	Siddens	608-243-3950	SE	46
277	Carmine	Brunon	673-570-4061	IR	28
278	Karen	Arthur	305-832-7217	ID	60
279	Mic	Feeham	424-129-2002	SE	21
280	Maure	Dutson	545-866-3652	ID	33
281	Raleigh	Statter	231-744-7929	CN	58
282	Darryl	Lomas	699-436-9134	SE	46
283	Lela	Wallhead	207-747-4957	CN	64
284	Anna	Fulbrook	256-988-9019	US	75
285	Lowrance	Trumpeter	428-222-3454	CN	72
286	Deana	McIlvoray	565-304-6545	SE	39
287	Elliot	Holttom	636-556-3056	PH	45
288	Sharyl	Jewer	226-900-2441	PH	70
289	Candide	Bloss	958-190-4323	JP	55
290	Diahann	Tallow	470-202-5034	LT	57
291	Stephan	Armatys	129-263-3591	PK	39
292	Meier	Swainsbury	563-938-5309	CN	68
293	Lemuel	Lineker	468-888-5877	DK	23
294	Bonny	Fenkel	433-317-9328	CN	30
295	Inglis	Benneton	612-367-8701	CN	54
296	Isa	Coneybeer	222-125-4752	RU	36
297	Perice	Findley	553-293-5321	CA	34
298	Debby	Friedenbach	329-320-4952	CN	38
299	Rubin	Toohey	243-321-5319	MZ	45
300	Evyn	Piddocke	379-130-4070	RU	61
301	Kacie	Vowell	539-367-6883	LV	42
302	Merlina	Probat	786-950-9042	US	20
303	Kelby	Mattiassi	449-927-6042	PL	74
304	Tonnie	Polino	177-996-4428	MX	50
305	Phaedra	Plaskett	174-643-0701	AF	26
306	Pauli	Mateja	637-643-6943	GR	27
307	Rosie	Heinritz	225-627-2128	CZ	61
308	Shena	McInteer	660-823-9026	PH	35
309	Kylen	Mewis	956-644-9387	CN	24
310	Ileane	Mcimmie	170-491-4001	ID	50
311	Meara	Thirlwell	220-827-7547	DO	40
312	Dyna	Galbreath	240-869-2118	BR	36
313	Keely	Peery	574-644-7540	PE	73
314	Bee	Wyper	395-320-5762	CO	22
315	Allene	Harlow	941-989-6434	GB	37
316	Homere	Josling	562-363-2579	ID	21
317	Marsiella	Parlett	557-982-7836	CN	21
318	Rozanne	Trayhorn	815-334-8029	RU	33
319	Dew	Ravenscraft	557-873-7078	MY	23
320	Cher	Neachell	561-844-4647	NG	54
321	Othelia	Hiers	142-611-7617	RU	61
322	Lyon	Grassot	109-551-3746	PT	57
323	Fleurette	Harmour	174-544-6528	PE	29
324	Gregorio	McMillan	950-234-4627	PL	62
325	Justine	Lillo	640-363-2590	VN	45
326	Natal	Pringle	263-938-0122	CN	73
327	Paola	Fonso	266-639-9810	PS	55
328	Allys	Rosenshine	493-668-1805	PL	49
329	Stuart	Dranfield	364-574-2085	BI	78
330	Nevsa	Sleite	462-237-6364	MG	31
331	Ame	Drakes	952-684-4524	CN	68
332	Terrell	Bome	913-543-0489	CN	80
333	Jeth	Troke	809-431-3224	PL	75
334	Clywd	Ringsell	883-545-8155	ID	37
335	Tyrus	Mowne	109-187-8812	PH	24
336	Isador	Berthouloume	802-621-1338	MK	58
337	Reube	Lindgren	818-192-4433	FR	19
338	Wilow	Shinefield	408-550-6652	ZA	77
339	Grantley	Helleker	543-729-9196	CN	53
340	Brittany	Eubank	722-494-9552	CN	62
341	Tamera	Laslett	799-627-3891	PH	57
342	Josey	Smolan	577-281-4754	SE	60
343	Adelind	Horrigan	753-466-8178	PH	72
344	Colleen	Youhill	556-621-1848	CN	77
345	Jessa	Sommerfeld	668-958-3664	CN	58
346	Dani	Ivanovic	427-758-1661	GR	77
347	Jocelyn	Greneham	296-827-1111	TH	67
348	Courtenay	Murcott	676-172-3869	PT	54
349	Teddi	Webberley	149-279-6047	ID	43
350	Sheffie	Laurenty	642-618-0391	DE	49
351	Lovell	Grinnell	315-252-4669	PH	51
352	Roslyn	Tytherton	713-370-6445	US	35
353	Cordy	Nutkins	634-646-3414	PT	18
354	Sylvester	Rodell	114-528-2540	MY	65
355	Claretta	Brickell	115-694-4810	PT	38
356	Fawn	Giorgioni	187-540-7904	UA	55
357	Sonny	Bartosch	724-997-2752	FR	60
358	Vivianna	Newlan	992-802-1532	PH	34
359	Erick	Flinders	262-631-4923	ID	70
360	Joycelin	Godly	743-545-9295	SE	18
361	Gilemette	Bootes	394-665-1950	RU	50
362	Annissa	Charte	981-468-0257	ID	58
363	Hugibert	Najera	991-105-2339	BD	65
364	Waldemar	Curnow	185-215-8529	AR	62
365	Doretta	Tod	439-538-7432	RS	53
366	Ayn	Albert	896-513-4244	CN	23
367	Megan	Gierke	211-705-4049	FR	78
368	Emmery	Milson	665-878-9786	JP	79
369	Wendi	Threlkeld	392-372-6771	FR	24
370	Vanna	Athey	207-538-8528	CN	66
371	Gunilla	Absolon	732-640-5457	BR	37
372	Nanon	Montford	584-378-5576	HN	27
373	Fredric	Oakenfull	939-398-6670	FR	24
374	Lu	Powney	653-516-0558	RU	34
375	Enrichetta	Viccars	191-112-0194	PH	49
376	Lucine	Arent	467-605-3895	ZA	59
377	Rodger	Evins	567-430-5001	AZ	44
378	Serge	Griswaite	309-410-0660	FR	79
379	Deborah	Housden	944-772-0548	SY	80
380	Celle	Yven	942-279-4461	DJ	61
381	Torrance	Oakly	121-991-1271	CN	19
382	Teresita	Blyde	952-220-3765	BR	23
383	Lenora	Torrejon	820-613-5523	RU	46
384	Ketti	Gero	542-337-2437	PH	78
385	Gard	Sarath	926-519-3238	RU	60
386	Wain	Grindlay	602-460-8679	RU	60
387	D'arcy	Cadamy	168-787-8051	PH	35
388	Nerita	Barlace	935-883-0867	ZW	50
389	Ellsworth	Ahrenius	542-864-5782	CN	40
390	Kathye	Forster	917-316-1794	RU	79
391	Theo	Shivlin	673-501-1115	CN	18
392	Mace	Simonassi	578-792-3102	CN	63
393	Joleen	Polk	716-552-2210	TZ	26
394	Beryl	Fullun	292-842-1001	RU	22
395	Kirby	Virgo	229-690-0507	IQ	45
396	Bendite	Marquiss	787-731-0058	IQ	19
397	Edik	Sansam	356-401-4353	SE	59
398	Darell	Finker	279-607-6671	HR	62
399	Marlo	Huxstep	407-277-4195	HR	52
400	Valeda	Muneely	220-801-2120	CN	19
401	Tisha	Courtonne	600-661-9625	BR	35
402	Lucine	Sambrook	569-622-4970	PH	75
403	Evelyn	Danford	554-704-0797	PA	36
404	Sunshine	Lovick	328-475-5678	CM	77
405	Ebony	Baldacco	976-309-8621	HR	72
406	Ruttger	Simons	916-109-7501	US	25
407	Ogdan	Hebborn	493-695-1090	PK	59
408	Romy	Tanfield	966-532-3549	RU	21
409	Nannette	Boddam	740-273-1976	CU	44
410	Gabbie	Rives	591-257-6730	CN	68
411	Myrtia	Philpot	218-823-5447	RU	46
412	Culver	Snoden	688-515-3447	CN	52
413	Arleta	Signore	618-757-2557	RU	30
414	Dee dee	Buessen	348-248-4582	CN	27
415	Corrina	Peppard	989-896-4900	CN	58
416	Odille	Flamank	558-108-6130	RU	38
417	Ida	Seaborne	914-241-9636	YE	26
418	Brigitte	McCrow	328-771-7487	CN	30
419	Sibelle	Charlon	305-607-9518	PE	23
420	Baryram	Leddy	661-282-0695	US	71
421	Greta	Sherbrooke	533-733-5082	LK	80
422	Jock	Brayson	183-584-5369	PH	64
423	Eva	Debrett	479-346-2578	PL	74
424	Madelle	O'Kerin	657-972-1314	CN	79
425	Evanne	Medlen	154-922-0035	CZ	27
426	Lorene	Pawlicki	767-583-7124	PH	22
427	Wait	Garmans	605-530-5591	ID	42
428	Daisie	Frisdick	842-702-7972	VE	37
429	Asher	Burren	347-281-0658	CN	76
430	Reta	Managh	577-299-7105	ID	72
431	Yale	Croxton	468-654-8710	ID	33
432	Obediah	Boundley	273-205-9528	PT	24
433	Vida	McKeating	456-378-0191	PL	43
434	Francesco	Battisson	645-444-4986	ID	64
435	Jemmy	Danaher	544-242-0873	BR	24
436	Gay	Kimbrough	448-759-8641	AO	21
437	Vassily	Scathard	159-823-7620	CN	59
438	Georges	Orritt	837-947-5046	CN	60
439	Dredi	Kleisel	217-724-0849	US	65
440	Ervin	Mansford	992-492-4545	BR	64
441	Albert	Blincow	818-767-8658	ID	25
442	Ravi	Langfat	345-968-0517	ID	63
443	Forbes	Kinnear	812-568-4954	ID	62
444	Jaimie	Poxson	419-916-7655	TN	46
445	Allie	Cornew	492-974-3758	RU	51
446	Maude	Gillham	323-308-7099	ET	20
447	Lu	Stuckes	696-748-2049	JP	73
448	Gerik	McGillivray	178-252-8188	PT	46
449	Lorelei	Chestney	838-984-1494	PT	73
450	Francis	Pharaoh	362-380-8298	CN	22
451	Petr	Cottill	869-914-6305	RU	41
452	Shurlock	Eccleshall	208-248-6062	PL	78
453	Chaddy	Werrit	664-264-9212	RE	45
454	Emmery	Coonihan	607-940-9028	US	67
455	Alphonso	Di Franceschi	529-755-7812	MN	47
456	Genny	Whear	970-895-2790	GR	28
457	Lezlie	Thandi	983-369-8764	FR	62
458	Maryjane	Willis	662-843-6452	ZW	78
459	Bent	Miall	876-609-1470	CN	66
460	Leanor	Baiden	821-261-1906	CN	19
461	Prinz	Doudny	689-136-0574	PK	51
462	Charis	Newhouse	261-686-6650	CN	27
463	Pansy	Stanier	829-200-8744	ID	18
464	Shelley	Cantor	516-694-3886	CN	48
465	Candie	Hearthfield	202-822-8965	IE	56
466	Trudie	Van der Kruys	792-936-1771	CN	58
467	Lily	Pigrome	853-978-5958	GR	41
468	Ianthe	Franies	587-369-5770	CR	30
469	Justinn	Noteyoung	858-204-9779	UA	51
470	Elli	Matousek	767-527-9781	BF	20
471	Chloe	Tunesi	320-608-8240	AF	72
472	Tamma	McCrann	670-637-4896	BJ	55
473	Hope	Cordero	852-408-4721	PL	39
474	Kippy	Fulleylove	853-667-6570	CN	28
475	Orella	Rouff	716-418-5145	EC	18
476	Hamid	Allsep	119-217-8842	CZ	37
477	Cecelia	Ghost	972-628-4562	PL	72
478	Rorie	Gantz	417-222-5141	PT	23
479	Jenny	Baglin	510-503-8051	AM	66
480	Bee	Parrin	179-378-3469	PF	45
481	Helen	Schoales	694-105-7752	CN	50
482	Waylan	Falck	338-775-6910	ID	34
483	Sibelle	Nickolls	255-475-1862	RS	48
484	Rafaelita	Ondrus	628-483-4873	RU	31
485	Wakefield	Giraudeau	466-553-8930	RU	61
486	Clemmy	Meanwell	678-418-4815	KE	30
487	Gina	McKew	825-999-0833	RU	49
488	Montague	Readie	734-448-3774	CN	48
489	Kareem	Dennis	624-556-0456	PH	67
490	Parrnell	Wetton	389-871-3966	NG	52
491	Sydney	Rodgier	953-914-1229	NG	58
492	Auberta	Saffon	313-588-1853	CN	72
493	Bee	Chisholme	516-271-8585	PE	59
494	Floyd	Sincock	836-826-5162	HR	33
495	Jesus	McClarence	295-901-9781	AL	60
496	Trixy	Yuille	891-408-7851	CO	37
497	Irvine	Withull	595-752-7740	ZA	49
498	Shell	Ferroni	397-266-4490	PL	36
499	Emelen	Van Hault	702-545-0463	US	43
500	Edwina	Steptoe	213-502-8995	FI	52
501	Ferrel	Nordass	689-290-3291	PH	79
502	Eudora	Joska	979-962-1180	CA	53
503	Orton	O'Corrane	737-453-0108	BR	34
504	Belinda	Oppery	470-703-1412	AR	61
505	Sayer	Badcock	636-388-7718	US	24
506	Deana	Cashmore	255-115-5792	RU	35
507	Lorrin	Bridgett	756-153-5038	CN	75
508	Taite	Farmery	311-643-2959	CN	51
509	Astrid	Stopher	430-147-0282	ID	47
510	Gilles	Halsworth	354-434-8854	FR	26
511	Evangeline	Grieg	571-258-6258	CN	25
512	Ketty	Llewelly	257-594-1955	CO	64
513	Erinna	McCadden	938-909-3878	SY	18
514	Roslyn	Delamaine	756-348-3377	RU	73
515	Marina	Brosini	890-231-6566	ID	73
516	Dun	Mufford	776-652-2657	SE	54
517	Olav	Simco	925-573-4461	PT	42
518	Penny	Culpan	788-761-0049	TZ	26
519	Storm	Backshell	507-978-2477	CO	24
520	Kristofer	Gittose	560-143-3578	BS	30
521	Celisse	Beernaert	958-828-6212	PH	63
522	Kellie	Longmead	265-734-2915	PE	37
523	Neal	McCathy	297-530-2199	ID	32
524	Dorice	Krysztofiak	911-728-6379	RU	35
525	Ambrosius	Ravenscraft	328-160-3678	RU	80
526	Kinna	Chadwin	620-469-5885	TZ	75
527	Lonnard	Oppery	680-327-0453	CN	47
528	Phyllis	Stichel	790-355-7156	RU	41
529	Bartlet	Al Hirsi	429-360-4209	UA	67
530	Davy	Byk	298-531-4374	CZ	56
531	Dwain	Avrasin	664-635-6389	MN	32
532	Fabian	Mushawe	395-801-8587	CN	69
533	Lon	MacMychem	689-447-3557	GR	79
534	Staffard	McChesney	544-813-5021	CN	25
535	Morgana	Dunbobin	287-939-2993	ZW	40
536	Euphemia	Engledow	511-339-1564	CN	79
537	Oswell	West-Frimley	745-818-6076	CN	26
538	Robbi	Adriani	830-883-3616	BO	35
539	Marc	Buggs	202-716-2457	US	19
540	Terry	Schafer	138-254-2176	CZ	22
541	Corey	Flatte	755-991-7074	CO	49
542	Oralie	Limming	787-441-0897	CN	31
543	Aristotle	Mostin	248-914-2592	CA	57
544	Jervis	Anmore	617-588-1974	CN	21
545	Zsa zsa	Aggio	281-651-6990	BR	29
546	Micky	Krook	415-721-1732	PA	36
547	Amanda	Saynor	758-266-7208	RU	49
548	Raine	Unwins	801-754-7414	ID	60
549	Sidonia	Krelle	584-934-7785	PH	72
550	Meredithe	Ferryman	175-415-7691	NO	21
551	Cherlyn	Knottley	590-527-0523	CN	50
552	Dall	Cubbit	994-346-8495	PL	49
553	Meredith	Tenpenny	420-829-9390	ID	67
554	Carter	Ivanenko	843-483-4236	CN	20
555	Elisa	Duquesnay	420-116-0203	CN	42
556	Janice	Boulding	739-110-7859	CN	49
557	Norean	Ferrieres	905-959-2800	PL	18
558	Jone	Sarfas	540-802-3026	CN	56
559	Arlana	Devoy	350-467-6008	KG	24
560	Nesta	Grahlman	776-497-6230	UA	24
561	Amii	Westcarr	197-293-2016	PH	56
562	Abdul	Jewster	440-455-2437	CN	44
563	Salvidor	Dugget	882-614-5955	ID	47
564	Renaud	Loges	848-550-7029	CN	21
565	Peter	Kundt	986-788-3303	CN	21
566	Gerry	Briiginshaw	409-281-7885	RU	51
567	Odelinda	Demko	527-860-5853	PT	27
568	Benny	Brownlea	966-610-9665	CN	18
569	Stacee	Bayston	266-551-8058	CN	75
570	Edwina	Julyan	154-819-5814	JP	25
571	Inigo	Thirtle	622-999-6410	PH	31
572	Roxine	Brumhead	309-481-2071	ID	77
573	Frants	Whitley	939-894-8076	PK	35
574	Ruperta	Frankham	635-328-0440	PH	58
575	Pablo	Hamblington	851-388-0216	CN	54
576	Olivia	Cake	757-772-9440	RU	57
577	Nathalia	Proven	198-397-8416	CN	30
578	Anna-maria	Wilson	847-183-5246	CN	59
579	Ulla	Belsher	743-212-1812	CN	25
580	Nert	Fergyson	143-757-9380	ID	70
581	Jessamine	Burghall	198-969-2245	AR	42
582	Desi	Eastmead	643-682-5745	ID	77
583	Josey	Stiegar	495-450-7938	ID	59
584	Hilde	Sommerton	361-381-1382	CN	73
585	Augie	Considine	567-670-6815	PH	24
586	Jacquette	Attoe	269-642-1300	RU	24
587	Adham	Lamble	204-457-7406	CN	27
588	Beauregard	Duquesnay	172-813-8121	NG	38
589	Sacha	Pontefract	274-323-7176	PT	19
590	Brand	Wittrington	757-691-2253	RU	48
591	Debera	Vieyra	758-431-2884	ET	42
592	Shirleen	De Minico	177-162-8850	PE	20
593	Hilary	Loins	602-198-3074	TZ	79
594	Maia	Bankes	902-954-0484	SE	80
595	Micky	Schusterl	281-361-6665	PL	23
596	Charleen	Janaszkiewicz	806-454-6776	CR	66
597	Free	Baudesson	189-955-6073	ID	54
598	Daryn	Dagwell	537-650-6559	GT	24
599	Etheline	Horribine	709-498-6926	ID	21
600	Hasty	Maypes	470-177-0315	MK	51
601	Maximilianus	Jacketts	127-733-9091	SE	18
602	Ondrea	Artin	666-375-1778	PL	43
603	Channa	Eaves	507-972-0306	CZ	68
604	Mureil	Mixer	997-120-6931	UA	54
605	Collen	March	336-144-1063	US	64
606	Julianna	Cosh	181-656-5552	PH	29
607	Jaimie	Matteau	813-736-5255	JP	32
608	Ewart	Roof	221-948-6044	GR	35
609	Natala	Cayton	247-434-2344	SE	33
610	Buddy	Haskayne	231-904-6404	PS	45
611	Eleonore	Lassey	765-234-5124	ID	50
612	Darby	Mumbray	911-484-9888	PH	64
613	Dame	Stamp	646-634-2695	EE	44
614	Siffre	Tarbin	828-278-4355	CA	32
615	Shelly	Davenall	714-157-2004	CU	31
616	Bertina	Hearmon	321-261-5981	JP	21
617	Lonnard	Simmen	166-606-2360	HN	37
618	Dominic	Flintoff	929-570-6474	ID	80
619	Jolie	McClymond	353-576-1142	CN	18
620	Giffer	Moncaster	677-853-6466	CN	18
621	Willie	Bramall	714-785-9820	UA	63
622	Almira	Campion	220-180-7586	BW	73
623	Jan	Dossettor	452-451-2653	CN	19
624	Maude	Sushams	667-181-1319	CN	22
625	Michell	Rides	444-418-6823	CN	24
626	Tate	Dessent	498-908-7896	UA	40
627	Olympe	Obert	726-234-0219	YE	54
628	Jacenta	McAneny	701-126-9894	CN	56
629	Dorice	Iorillo	872-781-7201	NO	40
630	Shay	Castanie	572-563-8349	CN	72
631	Dexter	Lorand	148-264-5214	ID	67
632	Leroi	Levin	845-270-4856	PH	64
633	Carl	Gianni	214-677-8195	CN	56
634	Chevy	Maggs	891-966-4740	CN	50
635	Rubia	Scorey	801-481-9865	US	76
636	Lexy	Burkhill	484-217-2890	AU	26
637	Cris	Burgott	598-682-5571	CN	77
638	Kathryn	Karpol	204-602-7367	CN	22
639	Corissa	Clowton	134-133-0114	ZA	58
640	Paten	Hollingsby	750-548-2651	CN	73
641	Winnah	Millberg	510-499-8475	PH	51
642	Maryann	Crossgrove	498-320-0622	PH	61
643	Rodina	Gude	823-245-6884	YE	27
644	Dav	Chiverton	664-530-6743	BR	37
645	Berni	Cuchey	735-673-3310	ID	57
646	Arabela	Flindall	681-119-7131	PS	35
647	Antonella	Curteis	402-259-3466	CN	26
648	Martin	Wetherald	534-433-6639	LV	50
649	Urbanus	Walch	691-781-2544	PH	28
650	Orin	Durham	588-265-1714	TH	79
651	Vinny	Broadbury	449-373-4356	ID	19
652	Sloan	Malacrida	788-711-1532	IR	22
653	Caresse	Farrimond	641-721-4206	CN	49
654	Bond	Hankin	615-942-5773	CN	80
655	Cassius	Coveny	619-168-6109	CM	38
656	Mufi	O'Cassidy	699-958-2469	ID	64
657	Les	Didsbury	300-227-0248	CN	39
658	Maia	Gherardesci	714-779-0146	LT	75
659	Marleah	Alpin	816-361-9446	PT	79
660	Lucio	Stronach	455-400-3943	SE	54
661	Saxon	Rablan	671-222-5837	TH	79
662	Dody	Zannutti	688-933-4972	GT	70
663	Winnah	Balloch	745-610-6742	FR	52
664	Gianina	Honisch	395-623-4827	NE	30
665	Katherina	Vasilischev	494-421-9425	FI	33
666	Veronike	Rontree	226-246-5495	PH	56
667	Seward	Preskett	196-215-4323	PT	46
668	Ida	Jaspar	336-966-5290	US	56
669	Klara	Frick	173-456-2601	GR	47
670	Drake	Kalisz	508-541-8644	JP	21
671	Cati	Baterip	171-194-8957	RU	44
672	Stepha	Bearn	372-452-4862	HU	49
673	Gabie	Stickels	955-981-3075	CN	52
674	Oby	Joist	247-767-8877	CN	34
675	Aimil	Romaines	618-317-1162	VN	63
676	Gordy	Rubenov	402-862-3530	CN	31
677	Amaleta	Alliott	436-183-8109	ID	37
678	Leanna	Lackeye	977-871-9045	LT	18
679	Carney	Marland	886-588-3190	CN	75
680	Rosalie	Readwing	302-390-5888	BR	30
681	Andie	Bingle	338-515-8032	RU	70
682	Dorie	Bravey	714-772-3996	RU	61
683	Chloe	Mears	117-129-5004	CN	35
684	Pren	Tordiffe	822-602-3238	HN	29
685	Melony	Francillo	392-911-3486	PT	42
686	Rosmunda	Parkinson	194-424-7210	BR	58
687	Julienne	Lockie	807-170-2397	NO	48
688	Shaylah	Caddens	410-275-4578	KE	51
689	Olympe	Wimbury	170-188-6469	SE	58
690	Anderea	Dunford	744-515-4942	EG	29
691	Lilah	Crick	627-177-2040	CN	55
692	Tannie	Birtchnell	482-763-6928	CN	78
693	Danika	Herity	887-318-1778	CN	46
694	Penelope	Goulbourne	801-398-2588	US	62
695	Matthieu	Swannick	529-121-5931	ID	76
696	Ginny	Pilmore	589-164-4954	CN	44
697	Annmarie	Skews	172-473-9890	UZ	37
698	Jacky	Ricardo	610-264-2895	RU	46
699	Blithe	Klimke	973-131-5891	CZ	72
700	Lin	Allridge	696-288-2503	BO	80
701	Gussy	McColm	769-703-2145	PL	62
702	Saxon	Blankley	643-611-3916	IR	76
703	Paul	Peacey	384-476-0126	FR	33
704	Emelina	Husband	844-527-7094	HU	74
705	Rupert	Hulstrom	217-681-2475	PT	58
706	Emyle	Beake	795-959-2324	MN	65
707	Leeann	Kirkman	279-587-1051	UA	68
708	Curry	Aronovitz	110-534-9624	MX	34
709	Orland	Dowden	261-410-1443	JP	53
710	Cammie	Llewellyn	302-298-1186	TH	44
711	Gabie	Giraths	128-344-3454	NO	51
712	Kristopher	Melendez	405-895-4098	US	62
713	Yolanthe	Kinglesyd	701-919-3654	TH	19
714	Walker	Frail	480-552-1996	UA	61
715	Sena	Cosley	680-710-0852	CO	73
716	Tessie	Abrahamian	357-101-8621	RU	69
717	Hermione	Demonge	523-566-3823	GT	68
718	Dorotea	Measures	862-806-1125	ID	67
719	Kattie	Leas	626-919-2946	SZ	62
720	Thebault	Kegley	305-768-3523	ID	39
721	Dotti	Pritchitt	363-232-0807	KE	50
722	Granthem	Castilljo	775-216-8661	PT	33
723	Griffin	Horlock	694-487-3899	CN	36
724	Seamus	Lightman	147-406-9129	NG	78
725	Shirleen	Strother	845-891-5122	ID	68
726	Estrella	Ipwell	728-491-7666	SI	39
727	Kimberli	Yakubovics	851-351-8059	BD	23
728	Ivette	See	217-367-6037	CN	46
729	Rosamond	Filipson	506-549-9970	FR	29
730	Jeremias	McIlmurray	875-609-7414	CN	61
731	Gail	Lanegran	233-787-0072	CN	54
732	Harriet	Carlsen	107-759-2177	PH	66
733	Tally	Blasi	609-433-4133	LT	42
734	Reuven	Piner	942-592-0893	CN	58
735	Leanor	Stansall	234-629-5238	FR	20
736	Lukas	Sarvar	525-778-3248	CN	80
737	Esta	Corbitt	333-776-1722	CN	43
738	Katine	Gartland	109-302-2522	BR	38
739	Dieter	Chinge de Hals	194-212-5566	CZ	46
740	Quintilla	Petrowsky	607-223-0398	BR	38
741	West	Cocozza	839-372-3411	BR	51
742	Helga	Tighe	228-512-6083	PL	21
743	Cori	McKinn	710-474-4339	UY	62
744	Ryan	Foggarty	859-716-8826	CD	26
745	Janna	Cuckoo	193-666-2467	RU	26
746	Rori	Frankiewicz	303-140-1269	TZ	36
747	Berti	Leman	309-743-8457	FI	20
748	Lenette	Sugar	527-296-4065	PT	72
749	Stephanie	Cawtheray	594-866-6717	BR	77
750	Carly	Farthin	627-713-3862	CL	23
751	George	Leathwood	597-350-5836	ID	59
752	Dotti	Baignard	873-101-7467	CN	21
753	Toddy	Gaddas	833-238-3841	MK	72
754	Letisha	Normavill	443-812-3404	NE	67
755	Layton	Delgado	730-929-9204	PH	49
756	Alvira	Corsan	545-449-2395	SE	20
757	Rebe	Greep	805-506-3572	SE	20
758	Micheil	Elsay	740-434-6243	RU	22
759	Harriott	Woolatt	825-349-9674	CM	60
760	Dagny	Marple	130-398-7520	ID	79
761	Crissy	Hellen	194-698-6028	CN	61
762	Darb	Hulle	294-705-7373	UA	77
763	Barnie	Farrans	580-109-5223	PT	59
764	Clementia	Biddwell	386-368-8167	CN	32
765	Gabbie	Starmont	261-717-7902	CN	23
766	Bryanty	Hoxey	929-953-7643	TH	71
767	Artie	Viggars	814-436-8164	CN	59
768	Natalya	Bagenal	153-392-6404	SE	80
769	Danielle	Harnett	164-372-4870	BR	34
770	Elli	Sowle	643-431-8681	CN	44
771	Emelyne	Boatwright	458-997-7394	SY	41
772	Edsel	Zanitti	590-932-1162	KP	74
773	Broddie	Andriveau	124-567-3262	BR	26
774	Corbett	Reddecliffe	755-358-3608	CN	57
775	Christian	Le Sarr	538-310-7548	SZ	43
776	Mara	Beinisch	531-136-6467	ID	34
777	Talyah	McComiskie	825-676-9467	PT	20
778	Merry	Tebboth	810-412-2076	MA	46
779	Codie	Dixon	888-767-4755	CN	20
780	Homer	Osmint	333-668-0249	AM	77
781	Ilene	Byrd	881-170-4534	PL	43
782	Matti	Anslow	826-763-7017	CZ	59
783	Lenora	McFaell	810-798-7470	PH	79
784	Kaleb	McKerley	604-774-3304	PL	80
785	Eleonore	Jacklin	515-615-0369	PL	30
786	Allx	Cuff	519-773-3026	DJ	71
787	Louise	Isitt	323-233-0416	US	74
788	Elianora	Casaletto	474-799-5822	CA	65
789	Granthem	O'Hagerty	867-966-6773	PT	35
790	Gunther	Satterthwaite	353-652-5338	ID	66
791	Armstrong	Edkins	981-966-1226	PH	23
792	Ulysses	Stepney	107-524-2709	CN	24
793	Blithe	Kupis	154-726-6817	IL	71
794	Karly	Warrener	681-772-1628	CZ	37
795	Derward	Calderon	479-979-5705	AL	47
796	Celinka	Tambling	905-664-7332	TH	62
797	Lazar	Castro	636-583-0396	CZ	22
798	Issy	Woodier	163-996-1016	AM	80
799	Gui	Gumbrell	577-141-6036	RU	64
800	Guglielma	Oen	700-571-9153	ID	65
801	Damien	Paulet	625-493-5755	FR	21
802	Vanya	Forri	188-566-6570	KZ	26
803	Iago	Lope	193-583-8984	BR	71
804	Larina	Dracey	416-984-1439	RU	61
805	Kincaid	Odo	531-206-2921	GR	62
806	Arden	Osmar	468-777-4334	FR	37
807	Lani	Pfeffel	210-998-9806	CN	79
808	Blanche	Itscowics	687-459-5413	MY	42
809	Weston	Satterfitt	704-957-4248	PE	74
810	Reid	Deaville	786-477-7471	CN	61
811	Karlan	Kingswood	254-983-6576	CN	46
812	Laney	Booth	309-184-2120	LT	74
813	Bobbie	Linsey	430-791-8136	TG	66
814	Mahmoud	Oman	714-500-9298	CN	78
815	Consalve	D'Aulby	955-689-6768	AM	76
816	Edlin	Halksworth	942-324-8700	YE	51
817	Phebe	Quartley	802-617-0434	CN	42
818	Fiorenze	Hosby	750-737-4152	ID	64
819	Cordell	McMenemy	422-144-2778	PL	55
820	Lyndell	Bergeon	823-260-4982	RU	71
821	Pace	Bunhill	615-782-2697	ID	71
822	Nobie	Linfitt	441-865-6018	HR	57
823	Cassie	Quenell	560-853-9770	CN	33
824	Rosanne	Whopples	870-674-7511	KH	25
825	Frasco	McKenna	268-986-5575	ID	70
826	Clarissa	Greener	274-893-4914	PE	43
827	Wesley	Hiscoe	618-840-4596	PH	41
828	Emili	Linstead	809-779-7662	ID	27
829	Silvan	Johansson	636-946-7027	NZ	18
830	Stan	Correa	608-132-0721	PL	66
831	Eddy	Ladlow	527-778-2190	PH	22
832	Klemens	Walder	859-691-3976	RU	35
833	Linea	Kloisner	312-219-1841	NG	32
834	Lavinie	Dignan	845-573-6249	ID	41
835	Cristin	Cartan	418-456-0167	CN	44
836	Shellysheldon	D'Almeida	540-576-2430	IE	23
837	Averell	Burhill	988-824-2584	SY	37
838	Saraann	Bowbrick	776-180-6754	TN	78
839	Rodd	Knotton	357-679-7637	EC	65
840	Andriana	Gehring	958-757-5553	MX	28
841	Annabal	Tynewell	223-633-9104	PS	47
842	Jaine	Skunes	790-868-0164	PH	56
843	Ivar	Hogsden	846-678-1557	ID	40
844	Elonore	Van der Hoven	578-754-6271	RU	77
845	Corly	Dufaur	602-165-0415	RU	48
846	Kennett	Symmons	633-147-3868	RS	46
847	Franny	Ordemann	260-466-9629	RU	70
848	Catherina	Liggins	894-428-9024	RU	51
849	Evangelia	Wooster	686-478-6725	RU	42
850	Rutledge	Iremonger	619-385-9724	PH	41
851	Luella	Nassi	652-490-3190	SE	32
852	Gusti	Littlefield	719-120-5278	ID	46
853	Alvy	Dunmore	947-490-0329	CN	55
854	Hillyer	Scutching	473-151-4464	CN	29
855	Slade	Kopelman	831-442-7454	PH	65
856	Shurlocke	Goddert.sf	685-809-9592	ID	19
857	Launce	Haggerston	562-412-8150	MX	60
858	Aleta	Peres	775-562-7604	BR	77
859	Devlen	Loveridge	295-389-0067	CL	73
860	Ferdinand	Belhome	570-895-0911	RU	29
861	Jennilee	Jewster	906-424-1702	AF	78
862	Jaimie	Duffyn	657-888-0385	CN	38
863	Gerard	Alenov	478-872-9267	BR	59
864	Yanaton	Scaplehorn	825-563-1811	TH	67
865	Jaquenetta	Iannazzi	637-456-2306	ZA	33
866	Andros	Ferrers	640-768-1387	CN	26
867	Dulcie	Presman	433-545-4045	PT	42
868	Ferd	Hanbidge	974-124-0516	NI	67
869	Clerkclaude	Rodders	215-715-2583	FR	49
870	Ada	Simonini	469-624-8886	US	33
871	Corrina	McLarty	594-387-3713	CU	66
872	Rebe	Poag	455-487-3817	CU	79
873	Zechariah	Swanne	419-291-9098	CN	50
874	Loralee	Klimek	337-826-9109	MN	61
875	Lolita	Shury	419-934-5881	ID	50
876	Monty	Ripping	230-671-6801	ID	73
877	Bari	Cree	751-110-6394	BR	30
878	Benjy	Wiltshaw	727-201-6460	SN	46
879	Myranda	Draycott	472-278-5422	PK	27
880	Lambert	Calafate	225-782-5749	TH	60
881	Malia	MacCombe	429-924-9861	CN	66
882	Sinclair	Hampson	868-222-6073	ID	33
883	Allene	Thrower	962-954-8697	FR	31
884	Colver	Klaus	991-631-3917	RU	21
885	Zeb	Ambrogio	523-645-2316	ID	45
886	Ansley	Holttom	796-342-4157	CN	23
887	Corry	Keeble	951-375-0981	ID	26
888	Scot	Kienl	230-724-7871	CZ	74
889	Tammara	Goodson	639-633-5872	PH	74
890	Ev	Lundon	860-607-7209	PH	39
891	Tersina	Cargo	739-417-0664	IR	25
892	Sabra	Winslow	529-289-5197	UG	76
893	Birgitta	Pygott	786-721-2214	BR	65
894	Darius	Aiton	185-517-4797	CO	75
895	Yevette	Oehm	967-678-7838	CZ	39
896	Amabelle	Hiscocks	385-262-3239	CN	30
897	Godfree	Rysom	240-309-0474	MX	76
898	Carleton	Hawe	552-865-4859	PH	61
899	Tracy	Loggie	292-157-4110	AG	61
900	Mordy	McKomb	226-867-5655	RU	60
901	Jdavie	Sparkwill	178-867-5096	NP	75
902	Aprilette	Glenfield	150-162-5798	PH	39
903	Obediah	Payton	644-995-9504	SE	19
904	Tanner	Zealey	539-351-9068	BR	60
905	Sydelle	Driscoll	437-720-0509	CY	32
906	Stephen	Caccavari	693-198-9127	CU	31
907	Marianna	Jopson	900-200-6216	LR	53
908	Andee	Kinman	448-378-9734	AM	67
909	Glynda	Brissenden	959-530-2631	ID	67
910	Perkin	Sparhawk	620-746-6742	CR	26
911	Loralee	Munro	575-148-6862	NG	37
912	Harv	Grisewood	116-944-4716	FR	73
913	Herbert	Parysiak	128-865-7148	CN	55
914	Fee	Heifer	564-974-0435	MA	80
915	Ferdie	Garratty	983-876-7136	ID	45
916	Sterling	Molden	491-986-8789	CN	52
917	Roseanna	Prantoni	856-894-5073	SI	35
918	Babb	Maddinon	148-129-2518	PH	60
919	Dominga	Dishmon	877-318-7582	CN	43
920	Shoshana	Brookzie	762-770-9884	SE	26
921	Thorvald	Belhome	478-770-1008	ID	46
922	Evelyn	Prowse	953-964-8318	ID	37
923	Pen	Bolin	402-240-6395	HN	51
924	Sharon	Austing	578-778-9968	CZ	49
925	Mayne	Haskell	408-486-1505	CN	70
926	Ellary	Dilloway	427-311-0539	BH	39
927	Ashely	Drable	452-180-6239	NG	43
928	Larissa	Cade	106-277-7079	CN	55
929	Barbette	Golson	604-354-7174	SE	66
930	Celene	Langford	371-168-3933	SE	50
931	Georgena	Graddell	469-774-2851	CN	42
932	Sadella	Bodocs	231-822-3816	VN	61
933	Durward	Lepope	716-883-6469	ID	26
934	Timothea	Langshaw	903-287-0005	PT	49
935	Eada	Quoit	957-518-4768	ZA	72
936	Goraud	Bunson	302-476-0507	PL	30
937	Garrot	Cod	414-657-1795	ID	71
938	Babara	Acum	813-535-8060	ID	73
939	Levey	Lorie	968-351-1860	PT	74
940	Georgeanne	Rack	750-121-8454	ID	77
941	Sheila	Haycroft	804-258-7662	PH	65
942	Perri	Cejka	832-251-6429	MX	63
943	Morissa	Ensley	488-145-3515	ID	42
944	Vincenz	Yarmouth	697-367-6197	MA	22
945	Alden	Plumbridge	697-500-7065	ZW	74
946	Thurston	Mattioni	272-316-9399	NG	18
947	Delmore	Titheridge	697-915-4620	AF	80
948	Celestina	Suffield	685-977-5035	CN	24
949	Eadith	Applewhaite	845-270-7390	PT	64
950	Tremayne	Burbidge	774-840-2325	CL	59
951	Kristo	Wilacot	264-819-3118	JO	60
952	Carmine	Ponton	756-425-6386	RU	27
953	Abbie	Sorbie	947-253-6935	GR	58
954	Kaylil	Milley	676-218-0409	PL	57
955	Amity	Busfield	735-965-1412	VN	33
956	Austin	Frapwell	711-696-4847	BR	30
957	Blinny	Gerretsen	661-441-5341	PL	44
958	Naomi	Edgley	362-126-8060	GR	19
959	Patten	Toye	228-198-4302	CN	56
960	Ward	Sadler	426-778-9049	BR	54
961	Guthrie	Bastow	251-948-8831	FR	35
962	Clio	Philipp	443-881-8881	RU	31
963	Lola	Lafford	396-215-4821	UA	76
964	Carmita	Gierardi	870-787-4438	ID	31
965	Cam	Angove	303-777-3465	GB	58
966	Jamill	McPhater	846-718-3953	ID	57
967	Jacintha	Grimes	904-772-6070	BR	46
968	Marsha	Giacomuzzi	230-282-0121	MY	38
969	Sebastiano	Mablestone	607-577-8203	CN	27
970	Amata	MacAdam	789-259-3202	PT	43
971	Giffard	Ivanichev	216-394-4140	HN	19
972	Chrisy	Cambden	613-331-6985	CN	24
973	Jo-ann	Kinver	124-755-1803	KZ	24
974	Collie	Bedlington	827-976-0218	DO	71
975	Chelsie	Shrawley	498-753-4094	CN	79
976	Titus	Lydford	683-876-7504	CN	46
977	Zollie	Gronaver	455-205-7742	FR	22
978	Parnell	Woolens	844-280-5285	ID	58
979	Gonzalo	Kindon	891-646-1587	PL	42
980	Cissy	Mateo	124-680-9283	CN	63
981	Cass	Ponde	792-828-2325	ID	70
982	Ernestine	Marchington	202-523-2319	US	75
983	Menard	Ohanessian	802-575-6334	SE	80
984	Gordon	Dottridge	777-459-1402	CA	54
985	Grissel	Trees	734-996-8710	CN	57
986	Dahlia	Jarvis	196-958-2977	DO	46
987	Hermia	Filshin	323-339-9234	PT	25
988	Peter	MacGinlay	691-774-0026	BR	43
989	Ezri	Tardiff	531-612-5936	ID	78
990	Hazel	Bonhan	573-756-6473	CN	47
991	Keane	Clearley	752-345-0143	AF	23
992	Lemuel	Kindall	413-937-9793	BR	69
993	Willi	Huggan	865-597-2045	US	75
994	Perla	Siemianowicz	589-134-6449	PT	65
995	Kalil	Derkes	244-242-8416	FR	46
996	Karlan	Clothier	183-371-7859	MK	35
997	Evania	Ioannou	632-797-1340	CN	34
998	Bev	Paulitschke	438-243-4802	CO	64
999	Derron	Branchett	949-844-4629	CN	24
1000	Karlik	Edwardson	763-293-3510	JP	72
1001	Madelena	Broadbear	200-566-9829	CN	47
1002	Rafaelia	Evans	413-448-8146	NG	43
1003	Darline	Mongain	603-139-5676	CN	63
1004	Constancia	Morrissey	422-218-4119	MX	25
1005	Cosmo	Alday	169-801-5808	PK	36
1006	Pall	Ruste	355-467-5739	PH	36
1007	Corri	McCoole	394-414-5829	PH	79
1008	Betty	Wetwood	437-554-0257	EG	25
1009	Philippine	Candy	230-462-5214	EG	57
1010	Tressa	Gianulli	970-366-9461	IR	26
1011	Georgianne	Cressingham	730-506-9122	BR	79
1012	Ruthy	Itzkovich	453-735-1109	SI	33
1013	Jolee	Ungerechts	917-747-4619	HR	22
1014	Meredithe	Mutch	597-386-8475	SE	19
1015	Annora	Manske	157-410-3598	PE	20
1016	Mirabel	Cleverly	408-778-7897	PE	41
1017	Penrod	Luckman	260-962-6546	CN	57
1018	Misty	Bessell	507-830-1757	CN	26
1019	Niel	Comley	930-296-2525	PH	29
1020	Elinor	Darby	112-328-1558	CO	71
1021	Lura	Faux	643-181-1005	IE	79
1022	Martita	Trench	340-323-4003	CU	54
1023	Ernesto	Lawson	205-554-7228	KP	36
1024	Dunn	Gath	891-185-8593	CN	18
1025	Lenna	Meneghi	583-825-7515	MK	51
1026	Hermon	Whitwood	953-947-7681	CN	32
1027	Nicolea	Blakely	311-601-1398	MX	42
1028	Lea	Acome	917-979-5532	ID	30
1029	Victoria	Gellately	239-267-4771	BR	22
\.


                                                                                                                          3340.dat                                                                                            0000600 0004000 0002000 00000000140 14452006424 0014237 0                                                                                                    ustar 00postgres                        postgres                        0000000 0000000                                                                                                                                                                        1	Farepad	250	4
7	Ekran	1000	10
2	Klavye	450	6
3	Ekran	16000	2
4	Fare	330	1
5	Klavye	450	1
\.


                                                                                                                                                                                                                                                                                                                                                                                                                                3342.dat                                                                                            0000600 0004000 0002000 00000000106 14452006424 0014243 0                                                                                                    ustar 00postgres                        postgres                        0000000 0000000                                                                                                                                                                        1	Depoda	4
2	Yolda	10
3	Depoda	2
4	Teslim edildi	1
5	Dagitimda	6
\.


                                                                                                                                                                                                                                                                                                                                                                                                                                                          restore.sql                                                                                         0000600 0004000 0002000 00000014334 14452006424 0015372 0                                                                                                    ustar 00postgres                        postgres                        0000000 0000000                                                                                                                                                                        --
-- NOTE:
--
-- File paths need to be edited. Search for $$PATH$$ and
-- replace it with the path to the directory containing
-- the extracted data files.
--
--
-- PostgreSQL database dump
--

-- Dumped from database version 15.3
-- Dumped by pg_dump version 15.3

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

DROP DATABASE companydb;
--
-- Name: companydb; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE companydb WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'English_United States.1252';


ALTER DATABASE companydb OWNER TO postgres;

\connect companydb

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

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: customers; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.customers (
    customer_id integer NOT NULL,
    first_name character varying(50),
    last_name character varying(75),
    phone character varying(30),
    country character varying(40),
    age integer DEFAULT 0
);


ALTER TABLE public.customers OWNER TO postgres;

--
-- Name: customers_customer_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.customers_customer_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.customers_customer_id_seq OWNER TO postgres;

--
-- Name: customers_customer_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.customers_customer_id_seq OWNED BY public.customers.customer_id;


--
-- Name: orders; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.orders (
    order_id bigint NOT NULL,
    item character varying(100),
    amount integer,
    customer_id integer
);


ALTER TABLE public.orders OWNER TO postgres;

--
-- Name: order_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.order_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.order_id_seq OWNER TO postgres;

--
-- Name: order_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.order_id_seq OWNED BY public.orders.order_id;


--
-- Name: shippings; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.shippings (
    shipping_id bigint NOT NULL,
    status character varying(20),
    customer_id integer
);


ALTER TABLE public.shippings OWNER TO postgres;

--
-- Name: shp_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.shp_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.shp_id_seq OWNER TO postgres;

--
-- Name: shp_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.shp_id_seq OWNED BY public.shippings.shipping_id;


--
-- Name: customers customer_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.customers ALTER COLUMN customer_id SET DEFAULT nextval('public.customers_customer_id_seq'::regclass);


--
-- Name: orders order_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.orders ALTER COLUMN order_id SET DEFAULT nextval('public.order_id_seq'::regclass);


--
-- Name: shippings shipping_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.shippings ALTER COLUMN shipping_id SET DEFAULT nextval('public.shp_id_seq'::regclass);


--
-- Data for Name: customers; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.customers (customer_id, first_name, last_name, phone, country, age) FROM stdin;
\.
COPY public.customers (customer_id, first_name, last_name, phone, country, age) FROM '$$PATH$$/3338.dat';

--
-- Data for Name: orders; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.orders (order_id, item, amount, customer_id) FROM stdin;
\.
COPY public.orders (order_id, item, amount, customer_id) FROM '$$PATH$$/3340.dat';

--
-- Data for Name: shippings; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.shippings (shipping_id, status, customer_id) FROM stdin;
\.
COPY public.shippings (shipping_id, status, customer_id) FROM '$$PATH$$/3342.dat';

--
-- Name: customers_customer_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.customers_customer_id_seq', 1029, true);


--
-- Name: order_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.order_id_seq', 7, true);


--
-- Name: shp_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.shp_id_seq', 5, true);


--
-- Name: customers customers_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.customers
    ADD CONSTRAINT customers_pkey PRIMARY KEY (customer_id);


--
-- Name: orders order_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.orders
    ADD CONSTRAINT order_pkey PRIMARY KEY (order_id);


--
-- Name: shippings shipping_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.shippings
    ADD CONSTRAINT shipping_pkey PRIMARY KEY (shipping_id);


--
-- Name: orders customer_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.orders
    ADD CONSTRAINT customer_fkey FOREIGN KEY (customer_id) REFERENCES public.customers(customer_id) NOT VALID;


--
-- Name: shippings customer_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.shippings
    ADD CONSTRAINT customer_fkey FOREIGN KEY (customer_id) REFERENCES public.customers(customer_id) NOT VALID;


--
-- PostgreSQL database dump complete
--

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    