// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.attestation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.core.util.Base64Url;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Objects;

/**
 * A Microsoft Azure Attestation response token body - the body of a response token issued by MAA.
 */
@Fluent
public final class AttestationResult implements JsonSerializable<AttestationResult> {
    /*
     * Unique Identifier for the token
     */
    @Generated
    private String jti;

    /*
     * The Principal who issued the token
     */
    @Generated
    private String iss;

    /*
     * The time at which the token was issued, in the number of seconds since 1970-01-0T00:00:00Z UTC
     */
    @Generated
    private Float iat;

    /*
     * The expiration time after which the token is no longer valid, in the number of seconds since 1970-01-0T00:00:00Z
     * UTC
     */
    @Generated
    private Float exp;

    /*
     * The not before time before which the token cannot be considered valid, in the number of seconds since
     * 1970-01-0T00:00:00Z UTC
     */
    @Generated
    private Float nbf;

    /*
     * An RFC 7800 Proof of Possession Key
     */
    @Generated
    private Object cnf;

    /*
     * The Nonce input to the attestation request, if provided.
     */
    @Generated
    private String nonce;

    /*
     * The Schema version of this structure. Current Value: 1.0
     */
    @Generated
    private String version;

    /*
     * Runtime Claims
     */
    @Generated
    private Object runtimeClaims;

    /*
     * Inittime Claims
     */
    @Generated
    private Object inittimeClaims;

    /*
     * Policy Generated Claims
     */
    @Generated
    private Object policyClaims;

    /*
     * The Attestation type being attested.
     */
    @Generated
    private String verifierType;

    /*
     * The certificate used to sign the policy object, if specified.
     */
    @Generated
    private JsonWebKey policySigner;

    /*
     * The SHA256 hash of the BASE64URL encoded policy text used for attestation
     */
    @Generated
    private Base64Url policyHash;

    /*
     * True if the enclave is debuggable, false otherwise
     */
    @Generated
    private Boolean isDebuggable;

    /*
     * The SGX Product ID for the enclave.
     */
    @Generated
    private Float productId;

    /*
     * The HEX encoded SGX MRENCLAVE value for the enclave.
     */
    @Generated
    private String mrEnclave;

    /*
     * The HEX encoded SGX MRSIGNER value for the enclave.
     */
    @Generated
    private String mrSigner;

    /*
     * The SGX SVN value for the enclave.
     */
    @Generated
    private Float svn;

    /*
     * A copy of the RuntimeData specified as an input to the attest call.
     */
    @Generated
    private Base64Url enclaveHeldData;

    /*
     * The SGX SVN value for the enclave.
     */
    @Generated
    private Object sgxCollateral;

    /*
     * DEPRECATED: Private Preview version of x-ms-ver claim.
     */
    @Generated
    private String deprecatedVersion;

    /*
     * DEPRECATED: Private Preview version of x-ms-sgx-is-debuggable claim.
     */
    @Generated
    private Boolean deprecatedIsDebuggable;

    /*
     * DEPRECATED: Private Preview version of x-ms-sgx-collateral claim.
     */
    @Generated
    private Object deprecatedSgxCollateral;

    /*
     * DEPRECATED: Private Preview version of x-ms-sgx-ehd claim.
     */
    @Generated
    private Base64Url deprecatedEnclaveHeldData;

    /*
     * DEPRECATED: Private Preview version of x-ms-sgx-ehd claim.
     */
    @Generated
    private Base64Url deprecatedEnclaveHeldData2;

    /*
     * DEPRECATED: Private Preview version of x-ms-sgx-product-id
     */
    @Generated
    private Float deprecatedProductId;

    /*
     * DEPRECATED: Private Preview version of x-ms-sgx-mrenclave.
     */
    @Generated
    private String deprecatedMrEnclave;

    /*
     * DEPRECATED: Private Preview version of x-ms-sgx-mrsigner.
     */
    @Generated
    private String deprecatedMrSigner;

    /*
     * DEPRECATED: Private Preview version of x-ms-sgx-svn.
     */
    @Generated
    private Float deprecatedSvn;

    /*
     * DEPRECATED: Private Preview version of x-ms-tee.
     */
    @Generated
    private String deprecatedTee;

    /*
     * DEPRECATED: Private Preview version of x-ms-policy-signer
     */
    @Generated
    private JsonWebKey deprecatedPolicySigner;

    /*
     * DEPRECATED: Private Preview version of x-ms-policy-hash
     */
    @Generated
    private Base64Url deprecatedPolicyHash;

    /*
     * DEPRECATED: Private Preview version of nonce
     */
    @Generated
    private String deprecatedRpData;

    /**
     * Creates an instance of AttestationResult class.
     */
    @Generated
    public AttestationResult() {
    }

    /**
     * Get the jti property: Unique Identifier for the token.
     * 
     * @return the jti value.
     */
    @Generated
    public String getJti() {
        return this.jti;
    }

    /**
     * Set the jti property: Unique Identifier for the token.
     * 
     * @param jti the jti value to set.
     * @return the AttestationResult object itself.
     */
    @Generated
    public AttestationResult setJti(String jti) {
        this.jti = jti;
        return this;
    }

    /**
     * Get the iss property: The Principal who issued the token.
     * 
     * @return the iss value.
     */
    @Generated
    public String getIss() {
        return this.iss;
    }

    /**
     * Set the iss property: The Principal who issued the token.
     * 
     * @param iss the iss value to set.
     * @return the AttestationResult object itself.
     */
    @Generated
    public AttestationResult setIss(String iss) {
        this.iss = iss;
        return this;
    }

    /**
     * Get the iat property: The time at which the token was issued, in the number of seconds since 1970-01-0T00:00:00Z
     * UTC.
     * 
     * @return the iat value.
     */
    @Generated
    public Float getIat() {
        return this.iat;
    }

    /**
     * Set the iat property: The time at which the token was issued, in the number of seconds since 1970-01-0T00:00:00Z
     * UTC.
     * 
     * @param iat the iat value to set.
     * @return the AttestationResult object itself.
     */
    @Generated
    public AttestationResult setIat(Float iat) {
        this.iat = iat;
        return this;
    }

    /**
     * Get the exp property: The expiration time after which the token is no longer valid, in the number of seconds
     * since 1970-01-0T00:00:00Z UTC.
     * 
     * @return the exp value.
     */
    @Generated
    public Float getExp() {
        return this.exp;
    }

    /**
     * Set the exp property: The expiration time after which the token is no longer valid, in the number of seconds
     * since 1970-01-0T00:00:00Z UTC.
     * 
     * @param exp the exp value to set.
     * @return the AttestationResult object itself.
     */
    @Generated
    public AttestationResult setExp(Float exp) {
        this.exp = exp;
        return this;
    }

    /**
     * Get the nbf property: The not before time before which the token cannot be considered valid, in the number of
     * seconds since 1970-01-0T00:00:00Z UTC.
     * 
     * @return the nbf value.
     */
    @Generated
    public Float getNbf() {
        return this.nbf;
    }

    /**
     * Set the nbf property: The not before time before which the token cannot be considered valid, in the number of
     * seconds since 1970-01-0T00:00:00Z UTC.
     * 
     * @param nbf the nbf value to set.
     * @return the AttestationResult object itself.
     */
    @Generated
    public AttestationResult setNbf(Float nbf) {
        this.nbf = nbf;
        return this;
    }

    /**
     * Get the cnf property: An RFC 7800 Proof of Possession Key.
     * 
     * @return the cnf value.
     */
    @Generated
    public Object getCnf() {
        return this.cnf;
    }

    /**
     * Set the cnf property: An RFC 7800 Proof of Possession Key.
     * 
     * @param cnf the cnf value to set.
     * @return the AttestationResult object itself.
     */
    @Generated
    public AttestationResult setCnf(Object cnf) {
        this.cnf = cnf;
        return this;
    }

    /**
     * Get the nonce property: The Nonce input to the attestation request, if provided.
     * 
     * @return the nonce value.
     */
    @Generated
    public String getNonce() {
        return this.nonce;
    }

    /**
     * Set the nonce property: The Nonce input to the attestation request, if provided.
     * 
     * @param nonce the nonce value to set.
     * @return the AttestationResult object itself.
     */
    @Generated
    public AttestationResult setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }

    /**
     * Get the version property: The Schema version of this structure. Current Value: 1.0.
     * 
     * @return the version value.
     */
    @Generated
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The Schema version of this structure. Current Value: 1.0.
     * 
     * @param version the version value to set.
     * @return the AttestationResult object itself.
     */
    @Generated
    public AttestationResult setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the runtimeClaims property: Runtime Claims.
     * 
     * @return the runtimeClaims value.
     */
    @Generated
    public Object getRuntimeClaims() {
        return this.runtimeClaims;
    }

    /**
     * Set the runtimeClaims property: Runtime Claims.
     * 
     * @param runtimeClaims the runtimeClaims value to set.
     * @return the AttestationResult object itself.
     */
    @Generated
    public AttestationResult setRuntimeClaims(Object runtimeClaims) {
        this.runtimeClaims = runtimeClaims;
        return this;
    }

    /**
     * Get the inittimeClaims property: Inittime Claims.
     * 
     * @return the inittimeClaims value.
     */
    @Generated
    public Object getInittimeClaims() {
        return this.inittimeClaims;
    }

    /**
     * Set the inittimeClaims property: Inittime Claims.
     * 
     * @param inittimeClaims the inittimeClaims value to set.
     * @return the AttestationResult object itself.
     */
    @Generated
    public AttestationResult setInittimeClaims(Object inittimeClaims) {
        this.inittimeClaims = inittimeClaims;
        return this;
    }

    /**
     * Get the policyClaims property: Policy Generated Claims.
     * 
     * @return the policyClaims value.
     */
    @Generated
    public Object getPolicyClaims() {
        return this.policyClaims;
    }

    /**
     * Set the policyClaims property: Policy Generated Claims.
     * 
     * @param policyClaims the policyClaims value to set.
     * @return the AttestationResult object itself.
     */
    @Generated
    public AttestationResult setPolicyClaims(Object policyClaims) {
        this.policyClaims = policyClaims;
        return this;
    }

    /**
     * Get the verifierType property: The Attestation type being attested.
     * 
     * @return the verifierType value.
     */
    @Generated
    public String getVerifierType() {
        return this.verifierType;
    }

    /**
     * Set the verifierType property: The Attestation type being attested.
     * 
     * @param verifierType the verifierType value to set.
     * @return the AttestationResult object itself.
     */
    @Generated
    public AttestationResult setVerifierType(String verifierType) {
        this.verifierType = verifierType;
        return this;
    }

    /**
     * Get the policySigner property: The certificate used to sign the policy object, if specified.
     * 
     * @return the policySigner value.
     */
    @Generated
    public JsonWebKey getPolicySigner() {
        return this.policySigner;
    }

    /**
     * Set the policySigner property: The certificate used to sign the policy object, if specified.
     * 
     * @param policySigner the policySigner value to set.
     * @return the AttestationResult object itself.
     */
    @Generated
    public AttestationResult setPolicySigner(JsonWebKey policySigner) {
        this.policySigner = policySigner;
        return this;
    }

    /**
     * Get the policyHash property: The SHA256 hash of the BASE64URL encoded policy text used for attestation.
     * 
     * @return the policyHash value.
     */
    @Generated
    public byte[] getPolicyHash() {
        if (this.policyHash == null) {
            return null;
        }
        return this.policyHash.decodedBytes();
    }

    /**
     * Set the policyHash property: The SHA256 hash of the BASE64URL encoded policy text used for attestation.
     * 
     * @param policyHash the policyHash value to set.
     * @return the AttestationResult object itself.
     */
    @Generated
    public AttestationResult setPolicyHash(byte[] policyHash) {
        if (policyHash == null) {
            this.policyHash = null;
        } else {
            this.policyHash = Base64Url.encode(CoreUtils.clone(policyHash));
        }
        return this;
    }

    /**
     * Get the isDebuggable property: True if the enclave is debuggable, false otherwise.
     * 
     * @return the isDebuggable value.
     */
    @Generated
    public Boolean isDebuggable() {
        return this.isDebuggable;
    }

    /**
     * Set the isDebuggable property: True if the enclave is debuggable, false otherwise.
     * 
     * @param isDebuggable the isDebuggable value to set.
     * @return the AttestationResult object itself.
     */
    @Generated
    public AttestationResult setIsDebuggable(Boolean isDebuggable) {
        this.isDebuggable = isDebuggable;
        return this;
    }

    /**
     * Get the productId property: The SGX Product ID for the enclave.
     * 
     * @return the productId value.
     */
    @Generated
    public Float getProductId() {
        return this.productId;
    }

    /**
     * Set the productId property: The SGX Product ID for the enclave.
     * 
     * @param productId the productId value to set.
     * @return the AttestationResult object itself.
     */
    @Generated
    public AttestationResult setProductId(Float productId) {
        this.productId = productId;
        return this;
    }

    /**
     * Get the mrEnclave property: The HEX encoded SGX MRENCLAVE value for the enclave.
     * 
     * @return the mrEnclave value.
     */
    @Generated
    public String getMrEnclave() {
        return this.mrEnclave;
    }

    /**
     * Set the mrEnclave property: The HEX encoded SGX MRENCLAVE value for the enclave.
     * 
     * @param mrEnclave the mrEnclave value to set.
     * @return the AttestationResult object itself.
     */
    @Generated
    public AttestationResult setMrEnclave(String mrEnclave) {
        this.mrEnclave = mrEnclave;
        return this;
    }

    /**
     * Get the mrSigner property: The HEX encoded SGX MRSIGNER value for the enclave.
     * 
     * @return the mrSigner value.
     */
    @Generated
    public String getMrSigner() {
        return this.mrSigner;
    }

    /**
     * Set the mrSigner property: The HEX encoded SGX MRSIGNER value for the enclave.
     * 
     * @param mrSigner the mrSigner value to set.
     * @return the AttestationResult object itself.
     */
    @Generated
    public AttestationResult setMrSigner(String mrSigner) {
        this.mrSigner = mrSigner;
        return this;
    }

    /**
     * Get the svn property: The SGX SVN value for the enclave.
     * 
     * @return the svn value.
     */
    @Generated
    public Float getSvn() {
        return this.svn;
    }

    /**
     * Set the svn property: The SGX SVN value for the enclave.
     * 
     * @param svn the svn value to set.
     * @return the AttestationResult object itself.
     */
    @Generated
    public AttestationResult setSvn(Float svn) {
        this.svn = svn;
        return this;
    }

    /**
     * Get the enclaveHeldData property: A copy of the RuntimeData specified as an input to the attest call.
     * 
     * @return the enclaveHeldData value.
     */
    @Generated
    public byte[] getEnclaveHeldData() {
        if (this.enclaveHeldData == null) {
            return null;
        }
        return this.enclaveHeldData.decodedBytes();
    }

    /**
     * Set the enclaveHeldData property: A copy of the RuntimeData specified as an input to the attest call.
     * 
     * @param enclaveHeldData the enclaveHeldData value to set.
     * @return the AttestationResult object itself.
     */
    @Generated
    public AttestationResult setEnclaveHeldData(byte[] enclaveHeldData) {
        if (enclaveHeldData == null) {
            this.enclaveHeldData = null;
        } else {
            this.enclaveHeldData = Base64Url.encode(CoreUtils.clone(enclaveHeldData));
        }
        return this;
    }

    /**
     * Get the sgxCollateral property: The SGX SVN value for the enclave.
     * 
     * @return the sgxCollateral value.
     */
    @Generated
    public Object getSgxCollateral() {
        return this.sgxCollateral;
    }

    /**
     * Set the sgxCollateral property: The SGX SVN value for the enclave.
     * 
     * @param sgxCollateral the sgxCollateral value to set.
     * @return the AttestationResult object itself.
     */
    @Generated
    public AttestationResult setSgxCollateral(Object sgxCollateral) {
        this.sgxCollateral = sgxCollateral;
        return this;
    }

    /**
     * Get the deprecatedVersion property: DEPRECATED: Private Preview version of x-ms-ver claim.
     * 
     * @return the deprecatedVersion value.
     */
    @Generated
    public String getDeprecatedVersion() {
        return this.deprecatedVersion;
    }

    /**
     * Set the deprecatedVersion property: DEPRECATED: Private Preview version of x-ms-ver claim.
     * 
     * @param deprecatedVersion the deprecatedVersion value to set.
     * @return the AttestationResult object itself.
     */
    @Generated
    public AttestationResult setDeprecatedVersion(String deprecatedVersion) {
        this.deprecatedVersion = deprecatedVersion;
        return this;
    }

    /**
     * Get the deprecatedIsDebuggable property: DEPRECATED: Private Preview version of x-ms-sgx-is-debuggable claim.
     * 
     * @return the deprecatedIsDebuggable value.
     */
    @Generated
    public Boolean isDeprecatedIsDebuggable() {
        return this.deprecatedIsDebuggable;
    }

    /**
     * Set the deprecatedIsDebuggable property: DEPRECATED: Private Preview version of x-ms-sgx-is-debuggable claim.
     * 
     * @param deprecatedIsDebuggable the deprecatedIsDebuggable value to set.
     * @return the AttestationResult object itself.
     */
    @Generated
    public AttestationResult setDeprecatedIsDebuggable(Boolean deprecatedIsDebuggable) {
        this.deprecatedIsDebuggable = deprecatedIsDebuggable;
        return this;
    }

    /**
     * Get the deprecatedSgxCollateral property: DEPRECATED: Private Preview version of x-ms-sgx-collateral claim.
     * 
     * @return the deprecatedSgxCollateral value.
     */
    @Generated
    public Object getDeprecatedSgxCollateral() {
        return this.deprecatedSgxCollateral;
    }

    /**
     * Set the deprecatedSgxCollateral property: DEPRECATED: Private Preview version of x-ms-sgx-collateral claim.
     * 
     * @param deprecatedSgxCollateral the deprecatedSgxCollateral value to set.
     * @return the AttestationResult object itself.
     */
    @Generated
    public AttestationResult setDeprecatedSgxCollateral(Object deprecatedSgxCollateral) {
        this.deprecatedSgxCollateral = deprecatedSgxCollateral;
        return this;
    }

    /**
     * Get the deprecatedEnclaveHeldData property: DEPRECATED: Private Preview version of x-ms-sgx-ehd claim.
     * 
     * @return the deprecatedEnclaveHeldData value.
     */
    @Generated
    public byte[] getDeprecatedEnclaveHeldData() {
        if (this.deprecatedEnclaveHeldData == null) {
            return null;
        }
        return this.deprecatedEnclaveHeldData.decodedBytes();
    }

    /**
     * Set the deprecatedEnclaveHeldData property: DEPRECATED: Private Preview version of x-ms-sgx-ehd claim.
     * 
     * @param deprecatedEnclaveHeldData the deprecatedEnclaveHeldData value to set.
     * @return the AttestationResult object itself.
     */
    @Generated
    public AttestationResult setDeprecatedEnclaveHeldData(byte[] deprecatedEnclaveHeldData) {
        if (deprecatedEnclaveHeldData == null) {
            this.deprecatedEnclaveHeldData = null;
        } else {
            this.deprecatedEnclaveHeldData = Base64Url.encode(CoreUtils.clone(deprecatedEnclaveHeldData));
        }
        return this;
    }

    /**
     * Get the deprecatedEnclaveHeldData2 property: DEPRECATED: Private Preview version of x-ms-sgx-ehd claim.
     * 
     * @return the deprecatedEnclaveHeldData2 value.
     */
    @Generated
    public byte[] getDeprecatedEnclaveHeldData2() {
        if (this.deprecatedEnclaveHeldData2 == null) {
            return null;
        }
        return this.deprecatedEnclaveHeldData2.decodedBytes();
    }

    /**
     * Set the deprecatedEnclaveHeldData2 property: DEPRECATED: Private Preview version of x-ms-sgx-ehd claim.
     * 
     * @param deprecatedEnclaveHeldData2 the deprecatedEnclaveHeldData2 value to set.
     * @return the AttestationResult object itself.
     */
    @Generated
    public AttestationResult setDeprecatedEnclaveHeldData2(byte[] deprecatedEnclaveHeldData2) {
        if (deprecatedEnclaveHeldData2 == null) {
            this.deprecatedEnclaveHeldData2 = null;
        } else {
            this.deprecatedEnclaveHeldData2 = Base64Url.encode(CoreUtils.clone(deprecatedEnclaveHeldData2));
        }
        return this;
    }

    /**
     * Get the deprecatedProductId property: DEPRECATED: Private Preview version of x-ms-sgx-product-id.
     * 
     * @return the deprecatedProductId value.
     */
    @Generated
    public Float getDeprecatedProductId() {
        return this.deprecatedProductId;
    }

    /**
     * Set the deprecatedProductId property: DEPRECATED: Private Preview version of x-ms-sgx-product-id.
     * 
     * @param deprecatedProductId the deprecatedProductId value to set.
     * @return the AttestationResult object itself.
     */
    @Generated
    public AttestationResult setDeprecatedProductId(Float deprecatedProductId) {
        this.deprecatedProductId = deprecatedProductId;
        return this;
    }

    /**
     * Get the deprecatedMrEnclave property: DEPRECATED: Private Preview version of x-ms-sgx-mrenclave.
     * 
     * @return the deprecatedMrEnclave value.
     */
    @Generated
    public String getDeprecatedMrEnclave() {
        return this.deprecatedMrEnclave;
    }

    /**
     * Set the deprecatedMrEnclave property: DEPRECATED: Private Preview version of x-ms-sgx-mrenclave.
     * 
     * @param deprecatedMrEnclave the deprecatedMrEnclave value to set.
     * @return the AttestationResult object itself.
     */
    @Generated
    public AttestationResult setDeprecatedMrEnclave(String deprecatedMrEnclave) {
        this.deprecatedMrEnclave = deprecatedMrEnclave;
        return this;
    }

    /**
     * Get the deprecatedMrSigner property: DEPRECATED: Private Preview version of x-ms-sgx-mrsigner.
     * 
     * @return the deprecatedMrSigner value.
     */
    @Generated
    public String getDeprecatedMrSigner() {
        return this.deprecatedMrSigner;
    }

    /**
     * Set the deprecatedMrSigner property: DEPRECATED: Private Preview version of x-ms-sgx-mrsigner.
     * 
     * @param deprecatedMrSigner the deprecatedMrSigner value to set.
     * @return the AttestationResult object itself.
     */
    @Generated
    public AttestationResult setDeprecatedMrSigner(String deprecatedMrSigner) {
        this.deprecatedMrSigner = deprecatedMrSigner;
        return this;
    }

    /**
     * Get the deprecatedSvn property: DEPRECATED: Private Preview version of x-ms-sgx-svn.
     * 
     * @return the deprecatedSvn value.
     */
    @Generated
    public Float getDeprecatedSvn() {
        return this.deprecatedSvn;
    }

    /**
     * Set the deprecatedSvn property: DEPRECATED: Private Preview version of x-ms-sgx-svn.
     * 
     * @param deprecatedSvn the deprecatedSvn value to set.
     * @return the AttestationResult object itself.
     */
    @Generated
    public AttestationResult setDeprecatedSvn(Float deprecatedSvn) {
        this.deprecatedSvn = deprecatedSvn;
        return this;
    }

    /**
     * Get the deprecatedTee property: DEPRECATED: Private Preview version of x-ms-tee.
     * 
     * @return the deprecatedTee value.
     */
    @Generated
    public String getDeprecatedTee() {
        return this.deprecatedTee;
    }

    /**
     * Set the deprecatedTee property: DEPRECATED: Private Preview version of x-ms-tee.
     * 
     * @param deprecatedTee the deprecatedTee value to set.
     * @return the AttestationResult object itself.
     */
    @Generated
    public AttestationResult setDeprecatedTee(String deprecatedTee) {
        this.deprecatedTee = deprecatedTee;
        return this;
    }

    /**
     * Get the deprecatedPolicySigner property: DEPRECATED: Private Preview version of x-ms-policy-signer.
     * 
     * @return the deprecatedPolicySigner value.
     */
    @Generated
    public JsonWebKey getDeprecatedPolicySigner() {
        return this.deprecatedPolicySigner;
    }

    /**
     * Set the deprecatedPolicySigner property: DEPRECATED: Private Preview version of x-ms-policy-signer.
     * 
     * @param deprecatedPolicySigner the deprecatedPolicySigner value to set.
     * @return the AttestationResult object itself.
     */
    @Generated
    public AttestationResult setDeprecatedPolicySigner(JsonWebKey deprecatedPolicySigner) {
        this.deprecatedPolicySigner = deprecatedPolicySigner;
        return this;
    }

    /**
     * Get the deprecatedPolicyHash property: DEPRECATED: Private Preview version of x-ms-policy-hash.
     * 
     * @return the deprecatedPolicyHash value.
     */
    @Generated
    public byte[] getDeprecatedPolicyHash() {
        if (this.deprecatedPolicyHash == null) {
            return null;
        }
        return this.deprecatedPolicyHash.decodedBytes();
    }

    /**
     * Set the deprecatedPolicyHash property: DEPRECATED: Private Preview version of x-ms-policy-hash.
     * 
     * @param deprecatedPolicyHash the deprecatedPolicyHash value to set.
     * @return the AttestationResult object itself.
     */
    @Generated
    public AttestationResult setDeprecatedPolicyHash(byte[] deprecatedPolicyHash) {
        if (deprecatedPolicyHash == null) {
            this.deprecatedPolicyHash = null;
        } else {
            this.deprecatedPolicyHash = Base64Url.encode(CoreUtils.clone(deprecatedPolicyHash));
        }
        return this;
    }

    /**
     * Get the deprecatedRpData property: DEPRECATED: Private Preview version of nonce.
     * 
     * @return the deprecatedRpData value.
     */
    @Generated
    public String getDeprecatedRpData() {
        return this.deprecatedRpData;
    }

    /**
     * Set the deprecatedRpData property: DEPRECATED: Private Preview version of nonce.
     * 
     * @param deprecatedRpData the deprecatedRpData value to set.
     * @return the AttestationResult object itself.
     */
    @Generated
    public AttestationResult setDeprecatedRpData(String deprecatedRpData) {
        this.deprecatedRpData = deprecatedRpData;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getPolicySigner() != null) {
            getPolicySigner().validate();
        }
        if (getDeprecatedPolicySigner() != null) {
            getDeprecatedPolicySigner().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("jti", this.jti);
        jsonWriter.writeStringField("iss", this.iss);
        jsonWriter.writeNumberField("iat", this.iat);
        jsonWriter.writeNumberField("exp", this.exp);
        jsonWriter.writeNumberField("nbf", this.nbf);
        if (this.cnf != null) {
            jsonWriter.writeUntypedField("cnf", this.cnf);
        }
        jsonWriter.writeStringField("nonce", this.nonce);
        jsonWriter.writeStringField("x-ms-ver", this.version);
        if (this.runtimeClaims != null) {
            jsonWriter.writeUntypedField("x-ms-runtime", this.runtimeClaims);
        }
        if (this.inittimeClaims != null) {
            jsonWriter.writeUntypedField("x-ms-inittime", this.inittimeClaims);
        }
        if (this.policyClaims != null) {
            jsonWriter.writeUntypedField("x-ms-policy", this.policyClaims);
        }
        jsonWriter.writeStringField("x-ms-attestation-type", this.verifierType);
        jsonWriter.writeJsonField("x-ms-policy-signer", this.policySigner);
        jsonWriter.writeStringField("x-ms-policy-hash", Objects.toString(this.policyHash, null));
        jsonWriter.writeBooleanField("x-ms-sgx-is-debuggable", this.isDebuggable);
        jsonWriter.writeNumberField("x-ms-sgx-product-id", this.productId);
        jsonWriter.writeStringField("x-ms-sgx-mrenclave", this.mrEnclave);
        jsonWriter.writeStringField("x-ms-sgx-mrsigner", this.mrSigner);
        jsonWriter.writeNumberField("x-ms-sgx-svn", this.svn);
        jsonWriter.writeStringField("x-ms-sgx-ehd", Objects.toString(this.enclaveHeldData, null));
        if (this.sgxCollateral != null) {
            jsonWriter.writeUntypedField("x-ms-sgx-collateral", this.sgxCollateral);
        }
        jsonWriter.writeStringField("ver", this.deprecatedVersion);
        jsonWriter.writeBooleanField("is-debuggable", this.deprecatedIsDebuggable);
        if (this.deprecatedSgxCollateral != null) {
            jsonWriter.writeUntypedField("maa-attestationcollateral", this.deprecatedSgxCollateral);
        }
        jsonWriter.writeStringField("aas-ehd", Objects.toString(this.deprecatedEnclaveHeldData, null));
        jsonWriter.writeStringField("maa-ehd", Objects.toString(this.deprecatedEnclaveHeldData2, null));
        jsonWriter.writeNumberField("product-id", this.deprecatedProductId);
        jsonWriter.writeStringField("sgx-mrenclave", this.deprecatedMrEnclave);
        jsonWriter.writeStringField("sgx-mrsigner", this.deprecatedMrSigner);
        jsonWriter.writeNumberField("svn", this.deprecatedSvn);
        jsonWriter.writeStringField("tee", this.deprecatedTee);
        jsonWriter.writeJsonField("policy_signer", this.deprecatedPolicySigner);
        jsonWriter.writeStringField("policy_hash", Objects.toString(this.deprecatedPolicyHash, null));
        jsonWriter.writeStringField("rp_data", this.deprecatedRpData);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AttestationResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AttestationResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AttestationResult.
     */
    @Generated
    public static AttestationResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AttestationResult deserializedAttestationResult = new AttestationResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("jti".equals(fieldName)) {
                    deserializedAttestationResult.jti = reader.getString();
                } else if ("iss".equals(fieldName)) {
                    deserializedAttestationResult.iss = reader.getString();
                } else if ("iat".equals(fieldName)) {
                    deserializedAttestationResult.iat = reader.getNullable(JsonReader::getFloat);
                } else if ("exp".equals(fieldName)) {
                    deserializedAttestationResult.exp = reader.getNullable(JsonReader::getFloat);
                } else if ("nbf".equals(fieldName)) {
                    deserializedAttestationResult.nbf = reader.getNullable(JsonReader::getFloat);
                } else if ("cnf".equals(fieldName)) {
                    deserializedAttestationResult.cnf = reader.readUntyped();
                } else if ("nonce".equals(fieldName)) {
                    deserializedAttestationResult.nonce = reader.getString();
                } else if ("x-ms-ver".equals(fieldName)) {
                    deserializedAttestationResult.version = reader.getString();
                } else if ("x-ms-runtime".equals(fieldName)) {
                    deserializedAttestationResult.runtimeClaims = reader.readUntyped();
                } else if ("x-ms-inittime".equals(fieldName)) {
                    deserializedAttestationResult.inittimeClaims = reader.readUntyped();
                } else if ("x-ms-policy".equals(fieldName)) {
                    deserializedAttestationResult.policyClaims = reader.readUntyped();
                } else if ("x-ms-attestation-type".equals(fieldName)) {
                    deserializedAttestationResult.verifierType = reader.getString();
                } else if ("x-ms-policy-signer".equals(fieldName)) {
                    deserializedAttestationResult.policySigner = JsonWebKey.fromJson(reader);
                } else if ("x-ms-policy-hash".equals(fieldName)) {
                    deserializedAttestationResult.policyHash
                        = reader.getNullable(nonNullReader -> new Base64Url(nonNullReader.getString()));
                } else if ("x-ms-sgx-is-debuggable".equals(fieldName)) {
                    deserializedAttestationResult.isDebuggable = reader.getNullable(JsonReader::getBoolean);
                } else if ("x-ms-sgx-product-id".equals(fieldName)) {
                    deserializedAttestationResult.productId = reader.getNullable(JsonReader::getFloat);
                } else if ("x-ms-sgx-mrenclave".equals(fieldName)) {
                    deserializedAttestationResult.mrEnclave = reader.getString();
                } else if ("x-ms-sgx-mrsigner".equals(fieldName)) {
                    deserializedAttestationResult.mrSigner = reader.getString();
                } else if ("x-ms-sgx-svn".equals(fieldName)) {
                    deserializedAttestationResult.svn = reader.getNullable(JsonReader::getFloat);
                } else if ("x-ms-sgx-ehd".equals(fieldName)) {
                    deserializedAttestationResult.enclaveHeldData
                        = reader.getNullable(nonNullReader -> new Base64Url(nonNullReader.getString()));
                } else if ("x-ms-sgx-collateral".equals(fieldName)) {
                    deserializedAttestationResult.sgxCollateral = reader.readUntyped();
                } else if ("ver".equals(fieldName)) {
                    deserializedAttestationResult.deprecatedVersion = reader.getString();
                } else if ("is-debuggable".equals(fieldName)) {
                    deserializedAttestationResult.deprecatedIsDebuggable = reader.getNullable(JsonReader::getBoolean);
                } else if ("maa-attestationcollateral".equals(fieldName)) {
                    deserializedAttestationResult.deprecatedSgxCollateral = reader.readUntyped();
                } else if ("aas-ehd".equals(fieldName)) {
                    deserializedAttestationResult.deprecatedEnclaveHeldData
                        = reader.getNullable(nonNullReader -> new Base64Url(nonNullReader.getString()));
                } else if ("maa-ehd".equals(fieldName)) {
                    deserializedAttestationResult.deprecatedEnclaveHeldData2
                        = reader.getNullable(nonNullReader -> new Base64Url(nonNullReader.getString()));
                } else if ("product-id".equals(fieldName)) {
                    deserializedAttestationResult.deprecatedProductId = reader.getNullable(JsonReader::getFloat);
                } else if ("sgx-mrenclave".equals(fieldName)) {
                    deserializedAttestationResult.deprecatedMrEnclave = reader.getString();
                } else if ("sgx-mrsigner".equals(fieldName)) {
                    deserializedAttestationResult.deprecatedMrSigner = reader.getString();
                } else if ("svn".equals(fieldName)) {
                    deserializedAttestationResult.deprecatedSvn = reader.getNullable(JsonReader::getFloat);
                } else if ("tee".equals(fieldName)) {
                    deserializedAttestationResult.deprecatedTee = reader.getString();
                } else if ("policy_signer".equals(fieldName)) {
                    deserializedAttestationResult.deprecatedPolicySigner = JsonWebKey.fromJson(reader);
                } else if ("policy_hash".equals(fieldName)) {
                    deserializedAttestationResult.deprecatedPolicyHash
                        = reader.getNullable(nonNullReader -> new Base64Url(nonNullReader.getString()));
                } else if ("rp_data".equals(fieldName)) {
                    deserializedAttestationResult.deprecatedRpData = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAttestationResult;
        });
    }
}
