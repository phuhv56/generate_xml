package com.gen.xml;

public class Template {
    public static final String header = "<?xml version=\"1.0\"?>\n" +
            "<?mso-application progid=\"Excel.Sheet\"?>\n" +
            "<Workbook xmlns=\"urn:schemas-microsoft-com:office:spreadsheet\"\n" +
            " xmlns:o=\"urn:schemas-microsoft-com:office:office\"\n" +
            " xmlns:x=\"urn:schemas-microsoft-com:office:excel\"\n" +
            " xmlns:ss=\"urn:schemas-microsoft-com:office:spreadsheet\"\n" +
            " xmlns:html=\"http://www.w3.org/TR/REC-html40\">\n" +
            " <DocumentProperties xmlns=\"urn:schemas-microsoft-com:office:office\">\n" +
            "  <Author>秋田強</Author>\n" +
            "  <LastAuthor>秋田強</LastAuthor>\n" +
            "  <Created>2019-08-08T00:12:24Z</Created>\n" +
            "  <Version>16.00</Version>\n" +
            " </DocumentProperties>\n" +
            " <OfficeDocumentSettings xmlns=\"urn:schemas-microsoft-com:office:office\">\n" +
            "  <AllowPNG/>\n" +
            " </OfficeDocumentSettings>\n" +
            " <ExcelWorkbook xmlns=\"urn:schemas-microsoft-com:office:excel\">\n" +
            "  <WindowHeight>7848</WindowHeight>\n" +
            "  <WindowWidth>21744</WindowWidth>\n" +
            "  <WindowTopX>32767</WindowTopX>\n" +
            "  <WindowTopY>32767</WindowTopY>\n" +
            "  <ProtectStructure>False</ProtectStructure>\n" +
            "  <ProtectWindows>False</ProtectWindows>\n" +
            " </ExcelWorkbook>\n" +
            " <Styles>\n" +
            "  <Style ss:ID=\"Default\" ss:Name=\"Normal\">\n" +
            "   <Alignment ss:Vertical=\"Center\"/>\n" +
            "   <Borders/>\n" +
            "   <Font ss:FontName=\"游ゴシック\" x:CharSet=\"128\" x:Family=\"Modern\" ss:Size=\"11\"\n" +
            "    ss:Color=\"#000000\"/>\n" +
            "   <Interior/>\n" +
            "   <NumberFormat/>\n" +
            "   <Protection/>\n" +
            "  </Style>\n" +
            "  <Style ss:ID=\"s62\">\n" +
            "   <Font ss:FontName=\"游ゴシック\" x:CharSet=\"128\" x:Family=\"Modern\" ss:Size=\"11\"\n" +
            "    ss:Color=\"#FF0000\"/>\n" +
            "  </Style>\n" +
            "  <Style ss:ID=\"s64\">\n" +
            "   <NumberFormat ss:Format=\"@\"/>\n" +
            "  </Style>\n" +
            " </Styles>\n" +
            " <Worksheet ss:Name=\"A\">\n" +
            "  <Names>\n" +
            "   <NamedRange ss:Name=\"A\" ss:RefersTo=\"=A!R2C1:R3C10\"/>\n" +
            "  </Names>\n" +
            "  <Table ss:ExpandedColumnCount=\"10\" ss:ExpandedRowCount=\"3\" x:FullColumns=\"1\"\n" +
            "   x:FullRows=\"1\" ss:DefaultColumnWidth=\"52.8\" ss:DefaultRowHeight=\"18\">\n" +
            "   <Column ss:Width=\"108.6\"/>\n" +
            "   <Column ss:Width=\"54.599999999999994\"/>\n" +
            "   <Column ss:Width=\"75.600000000000009\"/>\n" +
            "   <Column ss:Width=\"50.4\"/>\n" +
            "   <Column ss:Width=\"216.6\"/>\n" +
            "   <Column ss:Width=\"148.19999999999999\"/>\n" +
            "   <Column ss:Width=\"44.400000000000006\"/>\n" +
            "   <Column ss:Width=\"38.4\"/>\n" +
            "   <Column ss:Width=\"67.8\"/>\n" +
            "   <Column ss:Width=\"121.2\"/>\n" +
            "   <Row>\n" +
            "    <Cell>\n" +
            "      <PhoneticText xmlns=\"urn:schemas-microsoft-com:office:excel\">カメイテンメイ </PhoneticText>\n" +
            "      <Data\n" +
            "        ss:Type=\"String\">加盟支店名</Data>\n" +
            "      </Cell>\n" +
            "    <Cell><PhoneticText xmlns=\"urn:schemas-microsoft-com:office:excel\">カメイテン シテン オヤキギョウメイ </PhoneticText><Data\n" +
            "      ss:Type=\"String\">加盟支店親企業名</Data></Cell>\n" +
            "    <Cell><PhoneticText xmlns=\"urn:schemas-microsoft-com:office:excel\">シテン ショザイチ ユウビンバンゴウ </PhoneticText><Data\n" +
            "      ss:Type=\"String\">支店所在地郵便番号</Data></Cell>\n" +
            "    <Cell><PhoneticText xmlns=\"urn:schemas-microsoft-com:office:excel\">シテンショザイチジュウショ </PhoneticText><Data\n" +
            "      ss:Type=\"String\">支店所在地住所1</Data></Cell>\n" +
            "    <Cell><PhoneticText xmlns=\"urn:schemas-microsoft-com:office:excel\">シテンショザイチ ジュウショ </PhoneticText><Data\n" +
            "      ss:Type=\"String\">支店所在地住所2</Data></Cell>\n" +
            "    <Cell><PhoneticText xmlns=\"urn:schemas-microsoft-com:office:excel\">シテン デンワバングオ バンゴウ </PhoneticText><Data\n" +
            "      ss:Type=\"String\">支店電話番号</Data></Cell>\n" +
            "    <Cell><PhoneticText xmlns=\"urn:schemas-microsoft-com:office:excel\">シテン レンラクサキ </PhoneticText><Data\n" +
            "      ss:Type=\"String\">支店連絡先メールアドレス</Data></Cell>\n" +
            "    <Cell><PhoneticText xmlns=\"urn:schemas-microsoft-com:office:excel\">シテン </PhoneticText><Data\n" +
            "      ss:Type=\"String\">支店HP URL</Data></Cell>\n" +
            "    <Cell ss:StyleID=\"s62\"><PhoneticText\n" +
            "      xmlns=\"urn:schemas-microsoft-com:office:excel\">カメイシテン シテン </PhoneticText><Data\n" +
            "      ss:Type=\"String\">加盟支店CD</Data></Cell>\n" +
            "    <Cell ss:StyleID=\"s62\"><PhoneticText\n" +
            "      xmlns=\"urn:schemas-microsoft-com:office:excel\">カメイシテン ショゾク キギョウメイ </PhoneticText><Data\n" +
            "      ss:Type=\"String\">加盟支店所属企業名</Data></Cell>\n" +
            "   </Row>\n";
    public static final String footer = "</Table>\n" +
            "  <WorksheetOptions xmlns=\"urn:schemas-microsoft-com:office:excel\">\n" +
            "   <PageSetup>\n" +
            "    <Header x:Margin=\"0.3\"/>\n" +
            "    <Footer x:Margin=\"0.3\"/>\n" +
            "    <PageMargins x:Bottom=\"0.75\" x:Left=\"0.7\" x:Right=\"0.7\" x:Top=\"0.75\"/>\n" +
            "   </PageSetup>\n" +
            "   <Selected/>\n" +
            "   <Panes>\n" +
            "    <Pane>\n" +
            "     <Number>3</Number>\n" +
            "     <ActiveRow>8</ActiveRow>\n" +
            "     <ActiveCol>4</ActiveCol>\n" +
            "    </Pane>\n" +
            "   </Panes>\n" +
            "   <ProtectObjects>False</ProtectObjects>\n" +
            "   <ProtectScenarios>False</ProtectScenarios>\n" +
            "  </WorksheetOptions>\n" +
            "  <QueryTable xmlns=\"urn:schemas-microsoft-com:office:excel\">\n" +
            "   <Name>A</Name>\n" +
            "   <QuerySource>\n" +
            "    <QueryType>Text</QueryType>\n" +
            "    <TextWizardSettings>\n" +
            "     <Name x:HRef=\"C:\\Users\\akita\\OneDrive\\デスクトップ\\サンプルデータ\\A.csv\"/>\n" +
            "     <Source>932</Source>\n" +
            "     <Decimal>.</Decimal>\n" +
            "     <ThousandSeparator>,</ThousandSeparator>\n" +
            "     <TrailingMinusNumbers/>\n" +
            "     <FormatSettings>\n" +
            "      <FieldType>Text</FieldType>\n" +
            "      <FieldType>Text</FieldType>\n" +
            "      <FieldType>Text</FieldType>\n" +
            "      <FieldType>Text</FieldType>\n" +
            "      <FieldType>Text</FieldType>\n" +
            "      <FieldType>Text</FieldType>\n" +
            "      <FieldType>Text</FieldType>\n" +
            "      <FieldType>Text</FieldType>\n" +
            "      <FieldType>Text</FieldType>\n" +
            "      <FieldType>Text</FieldType>\n" +
            "     </FormatSettings>\n" +
            "     <Delimiters>\n" +
            "      <Tab/>\n" +
            "      <Comma/>\n" +
            "     </Delimiters>\n" +
            "    </TextWizardSettings>\n" +
            "    <VersionLastEdit>6</VersionLastEdit>\n" +
            "    <VersionLastRefresh>6</VersionLastRefresh>\n" +
            "   </QuerySource>\n" +
            "  </QueryTable>\n" +
            " </Worksheet>\n" +
            "</Workbook>";

    public static final String headerd = "<?xml version=\"1.0\"?>\n" +
            "<?mso-application progid=\"Excel.Sheet\"?>\n" +
            "<Workbook xmlns=\"urn:schemas-microsoft-com:office:spreadsheet\"\n" +
            " xmlns:o=\"urn:schemas-microsoft-com:office:office\"\n" +
            " xmlns:x=\"urn:schemas-microsoft-com:office:excel\"\n" +
            " xmlns:ss=\"urn:schemas-microsoft-com:office:spreadsheet\"\n" +
            " xmlns:html=\"http://www.w3.org/TR/REC-html40\">\n" +
            " <DocumentProperties xmlns=\"urn:schemas-microsoft-com:office:office\">\n" +
            "  <Author>秋田強</Author>\n" +
            "  <LastAuthor>秋田強</LastAuthor>\n" +
            "  <Created>2019-08-08T00:12:57Z</Created>\n" +
            "  <Version>16.00</Version>\n" +
            " </DocumentProperties>\n" +
            " <OfficeDocumentSettings xmlns=\"urn:schemas-microsoft-com:office:office\">\n" +
            "  <AllowPNG/>\n" +
            " </OfficeDocumentSettings>\n" +
            " <ExcelWorkbook xmlns=\"urn:schemas-microsoft-com:office:excel\">\n" +
            "  <WindowHeight>7848</WindowHeight>\n" +
            "  <WindowWidth>21744</WindowWidth>\n" +
            "  <WindowTopX>32767</WindowTopX>\n" +
            "  <WindowTopY>32767</WindowTopY>\n" +
            "  <ProtectStructure>False</ProtectStructure>\n" +
            "  <ProtectWindows>False</ProtectWindows>\n" +
            " </ExcelWorkbook>\n" +
            " <Styles>\n" +
            "  <Style ss:ID=\"Default\" ss:Name=\"Normal\">\n" +
            "   <Alignment ss:Vertical=\"Center\"/>\n" +
            "   <Borders/>\n" +
            "   <Font ss:FontName=\"游ゴシック\" x:CharSet=\"128\" x:Family=\"Modern\" ss:Size=\"11\"\n" +
            "    ss:Color=\"#000000\"/>\n" +
            "   <Interior/>\n" +
            "   <NumberFormat/>\n" +
            "   <Protection/>\n" +
            "  </Style>\n" +
            "  <Style ss:ID=\"s62\">\n" +
            "   <Font ss:FontName=\"游ゴシック\" x:CharSet=\"128\" x:Family=\"Modern\" ss:Size=\"11\"\n" +
            "    ss:Color=\"#FF0000\"/>\n" +
            "  </Style>\n" +
            "  <Style ss:ID=\"s63\">\n" +
            "   <NumberFormat ss:Format=\"@\"/>\n" +
            "  </Style>\n" +
            " </Styles>\n" +
            " <Worksheet ss:Name=\"C\">\n" +
            "  <Names>\n" +
            "   <NamedRange ss:Name=\"C_\" ss:RefersTo=\"='C'!R2C1:R3C3\"/>\n" +
            "  </Names>\n" +
            "  <Table ss:ExpandedColumnCount=\"3\" ss:ExpandedRowCount=\"3\" x:FullColumns=\"1\"\n" +
            "   x:FullRows=\"1\" ss:DefaultColumnWidth=\"52.8\" ss:DefaultRowHeight=\"18\">\n" +
            "   <Column ss:Width=\"14.4\"/>\n" +
            "   <Column ss:Width=\"44.400000000000006\"/>\n" +
            "   <Column ss:Width=\"108.6\"/>\n" +
            "   <Row>\n" +
            "    <Cell><Data ss:Type=\"String\">いつから未収なのか(年齢)</Data></Cell>\n" +
            "    <Cell><Data ss:Type=\"String\">未収金額</Data></Cell>\n" +
            "    <Cell ss:StyleID=\"s62\"><Data ss:Type=\"String\">申し込みに紐づくID</Data></Cell>\n" +
            "   </Row>\n";
    public static final String footerd = "</Table>\n" +
            "  <WorksheetOptions xmlns=\"urn:schemas-microsoft-com:office:excel\">\n" +
            "   <PageSetup>\n" +
            "    <Header x:Margin=\"0.3\"/>\n" +
            "    <Footer x:Margin=\"0.3\"/>\n" +
            "    <PageMargins x:Bottom=\"0.75\" x:Left=\"0.7\" x:Right=\"0.7\" x:Top=\"0.75\"/>\n" +
            "   </PageSetup>\n" +
            "   <Selected/>\n" +
            "   <Panes>\n" +
            "    <Pane>\n" +
            "     <Number>3</Number>\n" +
            "     <ActiveRow>8</ActiveRow>\n" +
            "     <ActiveCol>4</ActiveCol>\n" +
            "    </Pane>\n" +
            "   </Panes>\n" +
            "   <ProtectObjects>False</ProtectObjects>\n" +
            "   <ProtectScenarios>False</ProtectScenarios>\n" +
            "  </WorksheetOptions>\n" +
            "  <QueryTable xmlns=\"urn:schemas-microsoft-com:office:excel\">\n" +
            "   <Name>C</Name>\n" +
            "   <QuerySource>\n" +
            "    <QueryType>Text</QueryType>\n" +
            "    <TextWizardSettings>\n" +
            "     <Name x:HRef=\"C:\\Users\\akita\\OneDrive\\デスクトップ\\サンプルデータ\\C.csv\"/>\n" +
            "     <Source>932</Source>\n" +
            "     <Decimal>.</Decimal>\n" +
            "     <ThousandSeparator>,</ThousandSeparator>\n" +
            "     <TrailingMinusNumbers/>\n" +
            "     <FormatSettings>\n" +
            "      <FieldType>Text</FieldType>\n" +
            "      <FieldType>Text</FieldType>\n" +
            "      <FieldType>Text</FieldType>\n" +
            "     </FormatSettings>\n" +
            "     <Delimiters>\n" +
            "      <Tab/>\n" +
            "      <Comma/>\n" +
            "     </Delimiters>\n" +
            "    </TextWizardSettings>\n" +
            "    <VersionLastEdit>6</VersionLastEdit>\n" +
            "    <VersionLastRefresh>6</VersionLastRefresh>\n" +
            "   </QuerySource>\n" +
            "  </QueryTable>\n" +
            " </Worksheet>\n" +
            "</Workbook>";
}
