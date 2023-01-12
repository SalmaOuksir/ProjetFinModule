<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    exclude-result-prefixes="xs"
    version="2.0">
    <xsl:template match="/">
        <html>
            <head>
                <title>Relevé bancaire</title>
            </head>
            <body>
                <h1>Relevé bancaire</h1>
                    <ul>
                        <li>RIB : <xsl:value-of select="releve/@rib"></xsl:value-of></li>
                        <li>Date de Releve : <xsl:value-of select="releve/datereleve"></xsl:value-of></li>
                        <li>Solde : <xsl:value-of select="releve/solde"></xsl:value-of></li>
                    </ul>
                <ul>
                    <li>Operations :</li>
                    <ul>
                        <li>Date De Debut => <xsl:value-of select="releve/operations/@datedebut"></xsl:value-of></li>
                        <li>Date de fin =>  <xsl:value-of select="releve/operations/@datefin"></xsl:value-of></li>         
                    </ul>
                </ul>
                <table border="1">
                    <tr>         
                        <th>Opérations</th>
                        <th>Total débit</th>
                        <th>Total crédit</th>
                    </tr>
                    <tr>
                        <td>
                            <table border="1">
                                <tr>
                                    <th>Type</th>
                                    <th>Date</th>
                                    <th>Montant</th>
                                    <th>Description</th>
                                </tr>
                                <xsl:for-each select="releve/operations/operation">
                                    <tr >
                                        <td><xsl:value-of select="@type"/></td>
                                        <td><xsl:value-of select="@date"/></td>
                                        <td><xsl:value-of select="@montant"/></td>
                                        <td><xsl:value-of select="@description"/></td>
                                    </tr>
                                </xsl:for-each>
                            </table>
                        </td>
                        <td>
                            <xsl:variable name="debit" select="count(releve/operations/operation[@type='DEBIT']/@montant)"/>
                            <xsl:value-of select="$debit"/>
                        </td>
                        <td>
                            <xsl:variable name="credit" select="count(releve/operations/operation[@type='CREDIT']/@montant)"/>
                            <xsl:value-of select="$credit"/>
                        </td>
                    </tr>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>