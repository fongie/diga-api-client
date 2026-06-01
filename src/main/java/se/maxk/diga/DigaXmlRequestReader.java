/*
 * Copyright 2021-2026 Alex Therapeutics AB and individual contributors. Copyright 2026- Max Körlinge and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 */

package se.maxk.diga;

import java.io.InputStream;
import se.maxk.diga.model.DigaCodeValidationResponse;
import se.maxk.diga.model.DigaInvoiceResponse;

/** Reads decrypted raw XML request/response bodies and outputs more readable Java objects. */
public interface DigaXmlRequestReader {
  /**
   * Read an inputstream with XML contents containing the validation of a DiGA code validation
   * request and parse it.
   *
   * @param decryptedResponse
   * @return Relevant information in a new {@link DigaCodeValidationResponse} object. Note that the
   *     DigaApiResponse object contains fields which are not set by XML readers, like the HTTP
   *     status code.
   * @throws DigaXmlReaderException when reading the request body failed
   */
  DigaCodeValidationResponse readCodeValidationResponse(InputStream decryptedResponse)
      throws DigaXmlReaderException;

  /**
   * Read an inputstream with XML contents containing the validation report from a DiGA invoice and
   * parse it.
   *
   * @param decryptedReport
   * @return Relevant information in a new {@link DigaInvoiceResponse} object.
   * @throws DigaXmlReaderException when reading the request body failed
   */
  DigaInvoiceResponse readBillingReport(InputStream decryptedReport) throws DigaXmlReaderException;
}
