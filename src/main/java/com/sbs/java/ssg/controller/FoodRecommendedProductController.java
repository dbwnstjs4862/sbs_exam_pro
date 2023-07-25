package com.sbs.java.ssg.controller;

public class FoodRecommendedProductController {
	public FoodRecommendedProductController () {
	
	}
	
	public void foodRecommendedProduct () {
		while (true) {

					// 식품(제목)변수명 ㅎㅎ
			String[] menu = { "닭가슴살", "프로틴", "샐러드", "다이어트도시락", "소세지(닭가슴살)", "한입큐브(닭가슴살)" };

					// =====닭찌찌=================================================================
					// 닭가슴살 식품 추천
			String bardak = "바르닭";
			String heodak = "허닭";
			String kokobil = "꼬꼬빌";
			String rangkingdakcom = "랭킹닭컴";

					// 바르닭-닭찌찌
			String[] bardakChickenBreast = { "소스품은 닭가슴살 화이트어니언", "소스품은 닭가슴살 청양마요", "소스품은 닭가슴살 리얼커리", "소스품은 닭가슴살 사천짜장맛",
							"소스품은 닭가슴살 찜닭맛" };
			String[] bardakSteamChickenBreast = { "스팀 조각 닭가슴살 매콤칠리", "스팀 닭가슴살 오리지널", "스팀 닭가슴살 블랙페퍼", "스팀 닭가슴살 허브바베큐",
							"스팀 닭가슴살 6종 골라담기" };
			String[] bardakSmokedChickenBreast = { "훈제 닭가슴살 할라피뇨", "훈제 닭가슴살 오리지널", "훈제 닭가슴살 저염", "훈제 닭가슴살 페퍼",
							"훈제 닭가슴살 6종 골라담기" };

					// 바르닭-소세지
			String[] bardakSosejiSet = { "닭가슴살 후랑크 소시지 5종 세트", "닭가슴살 후랑크 꼬치 5종 세트", "닭가슴살 방울소시지 3종 세트" };
			String[] bardakFrankSoseji = { "닭가슴살 후랑크 소시지 오리지널", "닭가슴살 후랑크 소시지 치즈", "닭가슴살 후랑크 소시지 알싸청양",
							"닭가슴살 후랑크 소시지 불닭", "닭가슴살 후랑크 소시지 매콤갈비" };
			String[] bardakFrankStick = { "닭가슴살 후랑크 꼬치 오리지널", "닭가슴살 후랑크 꼬치 치즈", "닭가슴살 후랑크 꼬치 알싸청양", "닭가슴살 후랑크 꼬치 커리",
							"닭가슴살 후랑크 꼬치 페퍼" };
			String[] bardakBellSoSeji = { "닭가슴살 방울소시지 오리지널", "닭가슴살 방울소시지 알싸청양", "닭가슴살 방울소시지 치즈" };

					// 허닭-닭찌찌
			String[] heodakSauceChickenBreast = { "[허닭]소스 슬라이스 닭가슴살 120g 화이트머쉬룸 10팩", "[허닭]스팀 소스 닭안심 120g 바베큐",
							"[허닭]스팀 소스 닭안심 120g 핫바베큐", "[오빠닭]소스 슬라이스 닭가슴살 레드크림커리 120g" };
			String[] heodakSteamChickenBreast = { "[바디닭]소프트 저염 닭가슴살", "[허닭]스팀 닭가슴살 100g 마늘맛", "[허닭]스팀 닭가슴살 100g 고추맛",
							"[허닭]스팀 닭가슴살 100g 탄두리맛", "[허닭]스팀 닭가슴살 100g 깻잎맛", "[BBQ]BBQ BEST 그릴 통 닭가슴살" };
			String[] heodakSoftChickenBreast = { "[BHC]수비드 홀 닭가슴살 100g 4종 20팩", "[BHC]수비드 홀 닭가슴살 100g 4종 4팩",
							"[BHC]수비드 홀 닭가슴살 100g 4종 12팩", "[BHC]수비드 홀 닭가슴살 100g 4종 10팩" };

					// 허닭-한입큐브(닭가슴살)
			String[] heodakChawCube = { "[허닭]한입 닭가슴살 큐브 새우100g 10팩", "[허닭]한입 닭가슴살 큐브 오징어100g 10팩",
							"[허닭]한입 닭가슴살 어묵볼100g 감자베이컨 1팩", "[허닭]한입 닭가슴살 어묵볼100g 치즈 10팩" };
			String[] kokobilChawCube = { "[꼬꼬빌]심쿵 닭가슴살 오븐구이 저크바베큐 130g x 5팩", "[꼬꼬빌]심쿵 닭가슴살 오븐구이 저크바베큐 130g x 10팩",
							" [꼬꼬빌]심쿵 닭가슴살 오븐구이 치즈범벅 130g x 5팩", "[꼬꼬빌]심쿵 닭가슴살 오븐구이 저크바베큐 130g x 30팩" };

					// 랭킹닭컴
			String[] rangkingdakcomSteak = { "햇살닭 현미 닭가슴살 스테이크 100g", "맛있닭 닭가슴살 스테이크 오리지널 100g",
							"맛있닭 닭가슴살 스테이크 갈릭맛 100g", "맛있닭 닭가슴살 스테이크 고추맛 100g", "맛있닭 닭가슴살 스테이크 호박맛 100g",
							"맛있닭 소스 닭가슴살 스테이크 매콤 토마토 150g", "맛있닭 소스 닭가슴살 스테이크 로스트 갈릭 150g", "맛있닭 소스 닭가슴살 스테이크 자색고구마 까르보나라 150g",
							"맛있닭 소스 닭가슴살 스테이크 흑마늘 150g" };
					// 10개-다이어트,대회 준비 하는사람추천
			String[] rangkingdakcomLowSaltChickenBreast = { "맛있닭 저염 닭가슴살 100g", "맛있닭 프로 닭가슴살 120g",
							"맛있닭 닭가슴살 스테이크 갈릭맛 100g", "맛있닭 저염·프로 닭가슴살 혼합 100~120g", "(강추)잇메이트 저염 스팀 닭가슴살 오리지널 100g",
							"(강추)잇메이트 저염 닭가슴살 오리지널 100g", "햇살닭 저염 훈제 닭가슴살 플러스 100g", "햇살닭 저염 수비드 닭가슴살 150g",
							"햇살닭 저염 훈제 닭가슴살 오리지널 200g" };
					// 6개
			String[] rangkingdakcomNudeChickenBreast = { "랭커 IQF 한입 닭가슴살 100g", "랭커 IQF 한입 닭가슴살 200g",
							"랭커 IQF 한입 닭가슴살 1kg", "하림 동물복지 IFF 냉동 생 닭가슴살 800g", "다향 IQF 닭가슴살 1kg",
							"닭스몰 무항생제 1등급 냉동 생 닭가슴살 400g" };
					// 10개
			String[] rangkingdakcomSmokedChickenBreast = { "맛있닭 훈제 닭가슴살 훈제 100g", "맛있닭 훈제 닭가슴살 칠리 100g",
							"맛있닭 훈제 닭가슴살 카레 100g", "맛있닭 훈제 닭가슴살 혼합 100g", "잇메이트 훈제 닭가슴살 오리지널 100g", "잇메이트 훈제 닭가슴살 마늘 100g",
							"잇메이트 훈제 닭가슴살 할라피뇨 100g", "치품닭 치즈품은 훈제 닭가슴살 갈릭 110g", "치품닭 치즈품은 훈제 닭가슴살 고추 110g",
							"햇살닭 저염 훈제 닭가슴살 오리지널 200g" };

					// =====프로틴=================================================================
					// 프로틴 식품 추천 (프로틴 브랜드 : 마이프로틴, 신타6, 머스팜 컴뱃)
			String myProtein = "마이프로틴";
			String syntha6 = "신타6";
			String musclePharm = "머슬팜";

					// 마이프로틴/9개
			String[] myProtein1 = { "임팩트웨이프로틴", "임팩트웨이아이솔레이트", "모노크레아틴", "클리어웨이아아이솔레이트", "프로틴 식사대용 블렌드(저칼로리 식사대용)",
							"클리어웨이게이너", "임팩트다이어트웨이", "임팩트 프로틴 블렌드", "밀크 프로틴" };

					// 신타6/9개
			String[] syntha61 = { "단백질파우더드링크믹스(초콜릿밀크쉐이크)", "울트라프리미엄프로틴매트릭스(딸기밀크셰이크)", "콜드스톤 크리머리(민트초콜릿칩)",
							"콜드스톤크리머리쿠키돈트유원썸", "콜드스톤크리머리쿠키돈트유원썸", "비에스엔 프로틴 파우더", "비에스엔 아이솔레이트", "비에스엔 엣지" };

					// 머슬팜
			String[] musclePharm1 = { "울트라 웨이 머슬팜 컴뱃", "프로틴 파우더 머슬팜 컴뱃", "BCAA 아미노산 머슬팜 컴뱃", "CLA 머슬팜 컴뱃",
							"글루타민 머슬팜 컴뱃" };

					// =====샐러드=================================================================
					// 샐러드 식품 추천(샐러드 브랜드 : 샐러디아, 샐러마켓, 헬로 잇츠, 편한 한끼)
			String saladia = "샐러디아";
			String slimCook = "슬림쿡";
			String saladPanda = "샐러드판다";
			String pocketSalad = "포켓샐러드";

					// 샐러디아13개
			String[] saladia1 = { "그린 샐러드 빅볼", "토시살 샐러드 빅볼", "부채살 샐러드 빅볼", "목살 샐러드 빅볼", " 훈제 연어 샐러드 빅볼", "훈제 오리 샐러드 빅볼",
							" 촉촉 닭가슴살 샐러드 빅볼", "리코타치즈 샐러드 빅볼", "치킨 텐더 샐러드 빅볼", "무스 샐러드 빅볼", "아보카도 샐러드 빅볼", "구운 새우 샐러드 빅볼",
							"구운 야채 샐러드 빅볼" };
					// 슬림쿡
			String[] slimCook1 = { "[데일리] 그린 샐러드(드레싱x)", "[SET] 인기 샐러드 8종 맛보기 세트", "[데일리] 닭가슴살 오징어 샐러드 5팩 세트",
							"[데일리+프리미엄] 샐러드 골라담기", "[프리미엄] 샐러드 골라담기", "[프리미엄] 아보카불고기 샐러드", "[프리미엄] 그릴두부 샐러드",
							"[프리미엄] 그릴함박스테이크 샐러드", "[프리미엄] 아보카쉬림프 샐러드", "[데일리] 목살 스테이크 샐러드" };
					// 샐러드판다
			String[] saladPanda1 = { "샐린이 3종 세트", "베스트 4종 세트", "잘 챙겨먹어야해 6종 세트" };
					// 포켓샐러드
			String[] pocketSalad1 = { "그린 샐러드", "닭가슴살 샐러드", "훈제오리 샐러드", "닭가슴살볼 숯불갈비맛샐러드", "채소만 베이직 플러스 믹스 샐러드",
							"파스타 샐러드" };
			String[] pocketSaladRegularDelivery = { "(4주)정기배송 샐러드 (주/5일)", "(4주)정기배송 샐러드 (주/5일)",
							"(2주) 정기배송 샐러드 (주/6일)", "샐러드와 간편식(5일)", "(4주)정기배송 짜여진 식단", "(6주)정기배송 짜여진 식단" };

					// =====다이어트도시락=======================================================
					// 샐러드 식품 추천(도시락 브랜드 : 샐러디아, 슬림쿡, 허닭, 편한 한끼)

					// 샐러디아도시락 4개만하자...
			String[] saladiaDosirak = { "촉촉 닭가슴살 도시락", "훈제 오리 도시락", "목살 스테이크 도시락", "연어 스테이크 도시락" };
			String[] slimCookDosirak = { "[슬림쿡 런치] 플러스+ 정기배송 (10일)", "[슬림쿡 런치] 플러스+ 정기배송(5일)",
							"[슬림쿡 런치] 플러스+ 정기배송 (3일)", "[슬림쿡 런치] 도시락 정기배송 (3일)" };
			String[] heodakDosirak = { "잡곡밥 도시락 6종 24팩", "볶음밥 도시락 250g 6종 12팩", "다이어트 도시락 210g 4종 8팩",
							"일품도시락 10종 11팩" };
			String[] pyeonhanHankkiDosirak = { "한끼도시락 간편 냉동 복음밥 도시락 6팩", "식단도시락34종골라담기", "장인도시락 간편 식단관리 (남편/아이들도시락)",
							"고단백식 1주 닭가슴살 식단 도시락 (6종/6팩)" };

					// 목표기간 설정 스캐너
			
					// 식품 구현
			if (months >= 1 && months <= 3) { // 목표 감량 :1개월-6개월
				if (loss >= 1 && loss <= 5) { // 1kg~5kg감량
					System.out.printf("\n");
					System.out.printf("====== (%s개월/%skg 감량) %s 제품추천 ======\n", months, loss, menu[0]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[0], bardak,
									bardakChickenBreast[0], bardakChickenBreast[1], bardakSteamChickenBreast[2]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[0], heodak,
									heodakSauceChickenBreast[0], heodakSteamChickenBreast[1], heodakSoftChickenBreast[2]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[0], rangkingdakcom,
									rangkingdakcomSteak[0], rangkingdakcomLowSaltChickenBreast[1],
									rangkingdakcomNudeChickenBreast[2]);
					System.out.printf("\n");

							// 프로틴
					System.out.printf("====== (%s개월/%skg 감량) %s 제품추천 ======\n", months, loss, menu[1]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[1], myProtein,
									myProtein1[0], myProtein1[1], myProtein1[2]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[1], syntha6,
									syntha61[0], syntha61[1], syntha61[2]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[1], musclePharm,
									musclePharm1[0], musclePharm1[1], musclePharm1[2]);
					System.out.printf("\n");

							// 샐러드
					System.out.printf("====== (%s개월/%skg 감량) %s 제품추천 ======\n", months, loss, menu[2]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], saladia,
									saladia1[0], saladia1[1], saladia1[2]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], slimCook,
									slimCook1[0], slimCook1[1], slimCook1[2]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], saladPanda,
									saladPanda1[0], saladPanda1[1], saladPanda1[2]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], pocketSalad,
									pocketSalad1[0], pocketSalad1[1], pocketSalad1[2]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], pocketSalad,
									pocketSaladRegularDelivery[3], pocketSaladRegularDelivery[0], pocketSaladRegularDelivery[2]);
					System.out.printf("\n");

							// 다이어트도시락
					System.out.printf("====== (%s개월/%skg 감량) %s 제품추천 ======\n", months, loss, menu[3]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[3], saladia,
									saladiaDosirak[0], saladiaDosirak[1], saladiaDosirak[2]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[3], slimCook,
									slimCookDosirak[0], slimCookDosirak[1], slimCookDosirak[2]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[3], saladPanda,
									heodakDosirak[0], heodakDosirak[1], heodakDosirak[2]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[3], pocketSalad,
									pyeonhanHankkiDosirak[0], pyeonhanHankkiDosirak[1], pyeonhanHankkiDosirak[2]);
					System.out.printf("\n");
					break;
				} else if (loss > 5 && loss <= 10) { // 5kg~10kg감량일때
					System.out.printf("\n");
							// 닭찌찌흫
					System.out.printf("====== (%s개월/%skg 감량) %s 제품추천 ======\n", months, loss, menu[0]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[0], bardak,
									bardakChickenBreast[3], bardakChickenBreast[4], bardakSteamChickenBreast[5]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[0], heodak,
									heodakSauceChickenBreast[3], heodakSteamChickenBreast[4], heodakSoftChickenBreast[5]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[0], rangkingdakcom,
									rangkingdakcomSteak[3], rangkingdakcomLowSaltChickenBreast[4],
									rangkingdakcomNudeChickenBreast[5]);
					System.out.printf("\n");

							// 프로틴
					System.out.printf("====== (%s개월/%skg 감량) %s 제품추천 ======\n", months, loss, menu[1]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[1], myProtein,
									myProtein1[3], myProtein1[4], myProtein1[5]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[1], syntha6,
									syntha61[3], syntha61[4], syntha61[5]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[1], musclePharm,
									musclePharm1[3], musclePharm1[4], musclePharm1[5]);
					System.out.printf("\n");

							// 샐러드
					System.out.printf("====== (%s개월/%skg 감량) %s 제품추천 ======\n", months, loss, menu[2]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], saladia,
									saladia1[3], saladia1[4], saladia1[5]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], slimCook,
									slimCook1[3], slimCook1[4], slimCook1[5]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], saladPanda,
									saladPanda1[3], saladPanda1[4], saladPanda1[5]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], pocketSalad,
									pocketSalad1[3], pocketSalad1[4], pocketSalad1[5]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], pocketSalad,
									pocketSaladRegularDelivery[4], pocketSaladRegularDelivery[2], pocketSaladRegularDelivery[1]);
					System.out.printf("\n");

							// 다이어트도시락
					System.out.printf("====== (%s개월/%skg 감량) %s 제품추천 ======\n", months, loss, menu[3]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[3], saladia,
									saladiaDosirak[3], saladiaDosirak[4], saladiaDosirak[5]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[3], slimCook,
									slimCookDosirak[3], slimCookDosirak[4], slimCookDosirak[5]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[3], saladPanda,
									heodakDosirak[3], heodakDosirak[4], heodakDosirak[5]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[3], pocketSalad,
									pyeonhanHankkiDosirak[3], pyeonhanHankkiDosirak[4], pyeonhanHankkiDosirak[5]);
					System.out.printf("\n");
					break;

				} else if (loss > 10 && loss <= 15) { // 10kg~15kg감량일때
					System.out.printf("\n");
							// 닭찌찌흫
					System.out.printf("====== (%s개월/%skg 감량) %s 제품추천 ======\n", months, loss, menu[0]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[0], bardak,
									bardakChickenBreast[6], bardakChickenBreast[7], bardakSteamChickenBreast[8]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[0], heodak,
									heodakSauceChickenBreast[6], heodakSteamChickenBreast[7], heodakSoftChickenBreast[8]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[0], rangkingdakcom,
									rangkingdakcomSteak[6], rangkingdakcomLowSaltChickenBreast[7],
									rangkingdakcomNudeChickenBreast[8]);
					System.out.printf("\n");

							// 프로틴
					System.out.printf("====== (%s개월/%skg 감량) %s 제품추천 ======\n", months, loss, menu[1]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[1], myProtein,
									myProtein1[6], myProtein1[7], myProtein1[8]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[1], syntha6,
									syntha61[6], syntha61[7], syntha61[8]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[1], musclePharm,
									musclePharm1[6], musclePharm1[7], musclePharm1[8]);
					System.out.printf("\n");

							// 샐러드
					System.out.printf("====== (%s개월/%skg 감량) %s 제품추천 ======\n", months, loss, menu[2]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], saladia,
									saladia1[6], saladia1[7], saladia1[8]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], slimCook,
									slimCook1[6], slimCook1[7], slimCook1[8]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], saladPanda,
									saladPanda1[6], saladPanda1[7], saladPanda1[8]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], pocketSalad,
									pocketSalad1[6], pocketSalad1[7], pocketSalad1[8]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], pocketSalad,
									pocketSaladRegularDelivery[1], pocketSaladRegularDelivery[3], pocketSaladRegularDelivery[0]);
					System.out.printf("\n");

							// 다이어트도시락
					System.out.printf("====== (%s개월/%skg 감량) %s 제품추천 ======\n", months, loss, menu[3]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[3], saladia,
									saladiaDosirak[6], saladiaDosirak[7], saladiaDosirak[8]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[3], slimCook,
									slimCookDosirak[6], slimCookDosirak[7], slimCookDosirak[8]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[3], saladPanda,
									heodakDosirak[6], heodakDosirak[7], heodakDosirak[8]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[3], pocketSalad,
									pyeonhanHankkiDosirak[6], pyeonhanHankkiDosirak[7], pyeonhanHankkiDosirak[8]);
					System.out.printf("\n");
					break;
				} else {
					System.out.println("※※잘 못 입력 했습니다.※※");
					System.out.println("※※다시 입력 해주세요.※※");
					continue;
				}
			}
					// 1-3개월 다음 시작
			else if (months > 3 && months <= 6) { // 목표 감량 :3-6개월
				if (loss >= 1 && loss <= 5) {
					System.out.printf("\n");
							// 소세지(닭가슴살)
					System.out.printf("====== (%s개월/%skg 감량) %s 제품추천 ======\n", months, loss, menu[4]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[4], bardak,
									bardakSosejiSet[0], bardakSosejiSet[1], bardakSosejiSet[2]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[4], bardak,
									bardakFrankSoseji[0], bardakFrankSoseji[1], bardakFrankSoseji[2]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[4], bardak,
									bardakFrankStick[0], bardakFrankStick[1], bardakFrankStick[2]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[4], bardak,
									bardakBellSoSeji[0], bardakBellSoSeji[1], bardakBellSoSeji[2]);
					System.out.printf("\n");

							// 프로틴
					System.out.printf("====== (%s개월/%skg 감량) %s 제품추천 ======\n", months, loss, menu[1]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[1], myProtein,
									myProtein1[2], myProtein1[1], myProtein1[0]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[1], syntha6,
									syntha61[2], syntha61[1], syntha61[0]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[1], musclePharm,
									musclePharm1[2], musclePharm1[1], musclePharm1[0]);
					System.out.printf("\n");

							// 샐러드
					System.out.printf("====== (%s개월/%skg 감량) %s 제품추천 ======\n", months, loss, menu[2]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], saladia,
									saladia1[2], saladia1[1], saladia1[0]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], slimCook,
									slimCook1[2], slimCook1[1], slimCook1[0]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], saladPanda,
									saladPanda1[2], saladPanda1[1], saladPanda1[0]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], pocketSalad,
									pocketSalad1[2], pocketSalad1[1], pocketSalad1[0]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], pocketSalad,
									pocketSaladRegularDelivery[3], pocketSaladRegularDelivery[4], pocketSaladRegularDelivery[0]);
					System.out.printf("\n");

							// 다이어트도시락
					System.out.printf("====== (%s개월/%skg 감량) %s 제품추천 ======\n", months, loss, menu[3]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[3], saladia,
									saladiaDosirak[2], saladiaDosirak[1], saladiaDosirak[0]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[3], slimCook,
									slimCookDosirak[2], slimCookDosirak[1], slimCookDosirak[0]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[3], saladPanda,
									heodakDosirak[2], heodakDosirak[1], heodakDosirak[0]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[3], pocketSalad,
									pyeonhanHankkiDosirak[2], pyeonhanHankkiDosirak[1], pyeonhanHankkiDosirak[0]);
					System.out.printf("\n");
					break;
				} else if (loss > 5 && loss <= 10) {
					System.out.printf("\n");
							// 소세지(닭가슴살)
					System.out.printf("====== (%s개월/%skg 감량) %s 제품추천 ======\n", months, loss, menu[4]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[4], bardak,
									bardakSosejiSet[3], bardakSosejiSet[4], bardakSosejiSet[5]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[4], bardak,
									bardakFrankSoseji[3], bardakFrankSoseji[4], bardakFrankSoseji[5]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[4], bardak,
									bardakFrankStick[3], bardakFrankStick[4], bardakFrankStick[5]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[4], bardak,
									bardakBellSoSeji[3], bardakBellSoSeji[4], bardakBellSoSeji[5]);
					System.out.printf("\n");

							// 프로틴
					System.out.printf("====== (%s개월/%skg 감량) %s 제품추천 ======\n", months, loss, menu[1]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[1], myProtein,
									myProtein1[8], myProtein1[7], myProtein1[6]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[1], syntha6,
									syntha61[3], syntha61[7], syntha61[5]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[1], musclePharm,
									musclePharm1[4], musclePharm1[2], musclePharm1[3]);
					System.out.printf("\n");

							// 샐러드
					System.out.printf("====== (%s개월/%skg 감량) %s 제품추천 ======\n", months, loss, menu[2]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], saladia,
									saladia1[6], saladia1[7], saladia1[8]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], slimCook,
									slimCook1[6], slimCook1[7], slimCook1[8]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], saladPanda,
									saladPanda1[6], saladPanda1[7], saladPanda1[8]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], pocketSalad,
									pocketSalad1[6], pocketSalad1[7], pocketSalad1[8]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], pocketSalad,
									pocketSaladRegularDelivery[0], pocketSaladRegularDelivery[1], pocketSaladRegularDelivery[2]);
					System.out.printf("\n");

							// 다이어트도시락
					System.out.printf("====== (%s개월/%skg 감량) %s 제품추천 ======\n", months, loss, menu[3]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[3], saladia,
									saladiaDosirak[3], saladiaDosirak[2], saladiaDosirak[1]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[3], slimCook,
									slimCookDosirak[3], slimCookDosirak[2], slimCookDosirak[1]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[3], saladPanda,
									heodakDosirak[3], heodakDosirak[2], heodakDosirak[1]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[3], pocketSalad,
									pyeonhanHankkiDosirak[3], pyeonhanHankkiDosirak[2], pyeonhanHankkiDosirak[1]);
					System.out.printf("\n");
					break;
				} else if (loss > 10 && loss <= 15) { // 목표감량 : 10~15kg
					System.out.printf("\n");
							// 소세지(닭가슴살)
					System.out.printf("====== (%s개월/%skg 감량) %s 제품추천 ======\n", months, loss, menu[4]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[4], bardak,
									bardakSosejiSet[2], bardakSosejiSet[1], bardakSosejiSet[0]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[4], bardak,
									bardakFrankSoseji[2], bardakFrankSoseji[1], bardakFrankSoseji[0]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[4], bardak,
									bardakFrankStick[2], bardakFrankStick[1], bardakFrankStick[0]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[4], bardak,
									bardakBellSoSeji[2], bardakBellSoSeji[1], bardakBellSoSeji[0]);
					System.out.printf("\n");

							// 프로틴
					System.out.printf("====== (%s개월/%skg 감량) %s 제품추천 ======\n", months, loss, menu[1]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[1], myProtein,
									myProtein1[8], myProtein1[7], myProtein1[6]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[1], syntha6,
									syntha61[3], syntha61[7], syntha61[5]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[1], musclePharm,
									musclePharm1[4], musclePharm1[2], musclePharm1[3]);
					System.out.printf("\n");

							// 샐러드
					System.out.printf("====== (%s개월/%skg 감량) %s 제품추천 ======\n", months, loss, menu[2]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], saladia,
									saladia1[6], saladia1[7], saladia1[8]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], slimCook,
									slimCook1[6], slimCook1[7], slimCook1[8]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], saladPanda,
									saladPanda1[6], saladPanda1[7], saladPanda1[8]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], pocketSalad,
									pocketSalad1[6], pocketSalad1[7], pocketSalad1[8]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], pocketSalad,
									pocketSaladRegularDelivery[4], pocketSaladRegularDelivery[3], pocketSaladRegularDelivery[2]);
					System.out.printf("\n");

							// 다이어트도시락
					System.out.printf("====== (%s개월/%skg 감량) %s 제품추천 ======\n", months, loss, menu[3]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[3], saladia,
									saladiaDosirak[3], saladiaDosirak[2], saladiaDosirak[1]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[3], slimCook,
									slimCookDosirak[3], slimCookDosirak[2], slimCookDosirak[1]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[3], saladPanda,
									heodakDosirak[3], heodakDosirak[2], heodakDosirak[1]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[3], pocketSalad,
									pyeonhanHankkiDosirak[3], pyeonhanHankkiDosirak[2], pyeonhanHankkiDosirak[1]);
					System.out.printf("\n");
					break;
				} else {
					System.out.println("※※잘 못 입력 했습니다.※※");
					System.out.println("※※다시 입력 해주세요.※※");
					continue;
				}
			}
					// 3-6개월 다음 시작
			else if (months > 6 && months <= 12) {
				if (loss >= 1 && loss <= 5) { // 1kg~5kg감량
					System.out.printf("\n");
							// 한입큐브(닭가슴살)
					System.out.printf("====== (%s개월/%skg 감량) %s 제품추천 ======\n", months, loss, menu[5]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[5], heodak,
									heodakChawCube[0], heodakChawCube[1], heodakChawCube[2]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[5], heodak,
									kokobilChawCube[0], kokobilChawCube[1], kokobilChawCube[2]);
					System.out.printf("\n");

							// 프로틴
					System.out.printf("====== (%s개월/%skg 감량) %s 제품추천 ======\n", months, loss, menu[1]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[1], myProtein,
									myProtein1[2], myProtein1[1], myProtein1[0]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[1], syntha6,
									syntha61[2], syntha61[1], syntha61[0]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[1], musclePharm,
									musclePharm1[2], musclePharm1[1], musclePharm1[0]);
					System.out.printf("\n");

							// 샐러드
					System.out.printf("====== (%s개월/%skg 감량) %s 제품추천 ======\n", months, loss, menu[2]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], saladia,
									saladia1[2], saladia1[1], saladia1[0]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], slimCook,
									slimCook1[2], slimCook1[1], slimCook1[0]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], saladPanda,
									saladPanda1[2], saladPanda1[1], saladPanda1[0]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], pocketSalad,
									pocketSalad1[2], pocketSalad1[1], pocketSalad1[0]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], pocketSalad,
									pocketSaladRegularDelivery[3], pocketSaladRegularDelivery[4], pocketSaladRegularDelivery[0]);
					System.out.printf("\n");

							// 다이어트도시락
					System.out.printf("====== (%s개월/%skg 감량) %s 제품추천 ======\n", months, loss, menu[3]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[3], saladia,
									saladiaDosirak[2], saladiaDosirak[1], saladiaDosirak[0]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[3], slimCook,
									slimCookDosirak[2], slimCookDosirak[1], slimCookDosirak[0]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[3], saladPanda,
									heodakDosirak[2], heodakDosirak[1], heodakDosirak[0]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[3], pocketSalad,
									pyeonhanHankkiDosirak[2], pyeonhanHankkiDosirak[1], pyeonhanHankkiDosirak[0]);
					System.out.printf("\n");
					break;
				} else if (loss > 5 && loss <= 10) { // 5kg~10kg감량
					System.out.printf("\n");
							// 한입큐브(닭가슴살)
					System.out.printf("====== (%s개월/%skg 감량) %s 제품추천 ======\n", months, loss, menu[5]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[5], heodak,
									heodakChawCube[0], heodakChawCube[1], heodakChawCube[2]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[5], heodak,
									kokobilChawCube[0], kokobilChawCube[1], kokobilChawCube[2]);
					System.out.printf("\n");

							// 프로틴
					System.out.printf("====== (%s개월/%skg 감량) %s 제품추천 ======\n", months, loss, menu[1]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[1], myProtein,
									myProtein1[2], myProtein1[1], myProtein1[0]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[1], syntha6,
									syntha61[2], syntha61[1], syntha61[0]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[1], musclePharm,
									musclePharm1[2], musclePharm1[1], musclePharm1[0]);
					System.out.printf("\n");

							// 샐러드
					System.out.printf("====== (%s개월/%skg 감량) %s 제품추천 ======\n", months, loss, menu[2]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], saladia,
									saladia1[2], saladia1[1], saladia1[0]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], slimCook,
									slimCook1[2], slimCook1[1], slimCook1[0]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], saladPanda,
									saladPanda1[2], saladPanda1[1], saladPanda1[0]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], pocketSalad,
									pocketSalad1[2], pocketSalad1[1], pocketSalad1[0]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], pocketSalad,
									pocketSaladRegularDelivery[0], pocketSaladRegularDelivery[1], pocketSaladRegularDelivery[2]);
					System.out.printf("\n");

							// 다이어트도시락
					System.out.printf("====== (%s개월/%skg 감량) %s 제품추천 ======\n", months, loss, menu[3]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[3], saladia,
									saladiaDosirak[2], saladiaDosirak[1], saladiaDosirak[0]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[3], slimCook,
									slimCookDosirak[2], slimCookDosirak[1], slimCookDosirak[0]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[3], saladPanda,
									heodakDosirak[2], heodakDosirak[1], heodakDosirak[0]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[3], pocketSalad,
									pyeonhanHankkiDosirak[2], pyeonhanHankkiDosirak[1], pyeonhanHankkiDosirak[0]);
					System.out.printf("\n");
					break;
				} else if (loss > 10 && loss <= 15) { // 10kg~15kg감량
					System.out.printf("\n");
							// 한입큐브(닭가슴살)
					System.out.printf("====== (%s개월/%skg 감량) %s 제품추천 ======\n", months, loss, menu[5]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[5], heodak,
									heodakChawCube[3], heodakChawCube[2], heodakChawCube[1]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[5], heodak,
									kokobilChawCube[3], kokobilChawCube[1], kokobilChawCube[0]);
					System.out.printf("\n");

							// 프로틴
					System.out.printf("====== (%s개월/%skg 감량) %s 제품추천 ======\n", months, loss, menu[1]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[1], myProtein,
									myProtein1[0], myProtein1[1], myProtein1[2]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[1], syntha6,
									syntha61[0], syntha61[1], syntha61[2]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[1], musclePharm,
									musclePharm1[0], musclePharm1[1], musclePharm1[2]);
					System.out.printf("\n");

							// 샐러드
					System.out.printf("====== (%s개월/%skg 감량) %s 제품추천 ======\n", months, loss, menu[2]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], saladia,
									saladia1[11], saladia1[1], saladia1[0]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], slimCook,
									slimCook1[9], slimCook1[1], slimCook1[0]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], saladPanda,
									saladPanda1[0], saladPanda1[1], saladPanda1[2]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], pocketSalad,
									pocketSalad1[4], pocketSalad1[3], pocketSalad1[2]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[2], pocketSalad,
									pocketSaladRegularDelivery[4], pocketSaladRegularDelivery[3], pocketSaladRegularDelivery[2]);
					System.out.printf("\n");

							// 다이어트도시락
					System.out.printf("====== (%s개월/%skg 감량) %s 제품추천 ======\n", months, loss, menu[3]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[3], saladia,
									saladiaDosirak[2], saladiaDosirak[1], saladiaDosirak[0]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[3], slimCook,
									slimCookDosirak[2], slimCookDosirak[1], slimCookDosirak[0]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[3], saladPanda,
									heodakDosirak[2], heodakDosirak[1], heodakDosirak[0]);
					System.out.printf("회원님에게 추천하는 %s 브랜드는 %s이며, [%s, %s, %s]식품을 추천드립니다.\n", menu[3], pocketSalad,
									pyeonhanHankkiDosirak[2], pyeonhanHankkiDosirak[1], pyeonhanHankkiDosirak[0]);
					System.out.printf("\n");
					break;
				} else {
					System.out.println("※※잘 못 입력 했습니다.※※");
					System.out.println("※※다시 입력 해주세요.※※");
					continue;
				}
			} else {
				System.out.println("※※잘 못 입력 했습니다.※※");
				System.out.println("※※다시 입력 해주세요.※※");
				continue;
			}
		}
	}
}




