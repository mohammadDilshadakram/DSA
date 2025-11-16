#ifndef GAMESYSTEM_H
#define GAMESYSTEM_H

#include <string>
#include <json/json.h>   // or replace with your preferred JSON lib

// ---------------------------------------------------------
// Forward Declarations
// ---------------------------------------------------------
class PlayerAttributeModifier;
class VisualEffectStrategy;
class StadiumLighting;
class CameraEffects;

// ---------------------------------------------------------
// GameManager
// ---------------------------------------------------------
class GameManager {
private:
    std::string id;
    int currentQuarter;
    int timeLeft;

public:
    GameManager(const std::string& gameId);

    void updateGameState(int deltaTime);
    void advanceQuarter();
    int getTimeLeft() const;
    int getCurrentQuarter() const;
    std::string getId() const;
};

// ---------------------------------------------------------
// PlayEvent
// ---------------------------------------------------------
class PlayEvent {
private:
    std::string eventType;
    float impactValue;
    std::string teamResponsible;

public:
    PlayEvent(const std::string& type, float impact, const std::string& team);

    float getImpactValue() const;
    std::string getEventType() const;
    std::string getTeamResponsible() const;

    PlayerAttributeModifier generateModifier() const;
};

// ---------------------------------------------------------
// PlayerAttributeModifier
// ---------------------------------------------------------
class PlayerAttributeModifier {
private:
    float boostAmount;
    int duration;

public:
    PlayerAttributeModifier(float boost, int durationFrames);

    float getBoostAmount() const;
    int getDuration() const;

    void applyToPlayer(class Player& player) const;
};

// ---------------------------------------------------------
// Player
// ---------------------------------------------------------
class Player {
private:
    Json::Value baseRatings;
    Json::Value adjustedRatings;

public:
    Player(const Json::Value& base);

    void applyModifier(const PlayerAttributeModifier& mod);
    Json::Value getRatings() const;
};

// ---------------------------------------------------------
// MomentumSystem
// ---------------------------------------------------------
class MomentumSystem {
private:
    float homeMomentumLevel;
    float awayMomentumLevel;

public:
    MomentumSystem();

    void applyPlayEvent(const PlayEvent& event);
    float getHomeMomentum() const;
    float getAwayMomentum() const;
};

// ---------------------------------------------------------
// UIMomentumMeter
// ---------------------------------------------------------
class UIMomentumMeter {
private:
    float meterLevel;
    std::string teamColor;

public:
    UIMomentumMeter(const std::string& color);

    void update(float newLevel);
    float getMeterLevel() const;
};

// ---------------------------------------------------------
// AccessibilitySettings
// ---------------------------------------------------------
class AccessibilitySettings {
private:
    bool cameraShakeEnabled;
    float audioIntensityLevel;

public:
    AccessibilitySettings();

    bool isCameraShakeEnabled() const;
    float getAudioIntensityLevel() const;

    void setCameraShakeEnabled(bool enabled);
    void setAudioIntensityLevel(float level);
};

// ---------------------------------------------------------
// VisualEffectStrategy (Base class / Interface)
// ---------------------------------------------------------
class VisualEffectStrategy {
public:
    virtual ~VisualEffectStrategy() = default;

    virtual void apply(CameraEffects& camera, StadiumLighting& lighting) = 0;
};

// ---------------------------------------------------------
// CrowdManager
// ---------------------------------------------------------
class CrowdManager {
private:
    VisualEffectStrategy* effectStrategy;

public:
    CrowdManager();

    void setStrategy(VisualEffectStrategy* strategy);
    void applyEffect(CameraEffects& camera, StadiumLighting& lighting);
};

// ---------------------------------------------------------
// StadiumLighting
// ---------------------------------------------------------
class StadiumLighting {
private:
    float brightness;
    float flickerRate;

public:
    StadiumLighting();

    void setBrightness(float value);
    void setFlickerRate(float value);

    float getBrightness() const;
    float getFlickerRate() const;
};

// ---------------------------------------------------------
// CameraEffects
// ---------------------------------------------------------
class CameraEffects {
private:
    float shakeIntensity;
    float vibrationLevel;

public:
    CameraEffects();

    void setShakeIntensity(float intensity);
    void setVibrationLevel(float level);

    float getShakeIntensity() const;
    float getVibrationLevel() const;
};

#endif // GAMESYSTEMS_H
